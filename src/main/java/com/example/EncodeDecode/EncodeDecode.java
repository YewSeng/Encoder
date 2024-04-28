package com.example.EncodeDecode;

public class EncodeDecode implements EncoderBlueprint {

	// According to qns, offset character will be provided
	private char offsetCharacter;
	private static final String REFERENCE_TABLE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
		
	// Offset character has to be set at initialization
	public EncodeDecode(char offsetCharacter) {
		super();
		this.offsetCharacter = offsetCharacter;
	}

	// Generate Shift Table
	private String generateShiftTable(char offsetCharacter) {
		// Check position of offset character based on REFERENCE_TABLE
		int offsetPosition = REFERENCE_TABLE.indexOf(offsetCharacter);
		// max position of the REFERENCE_TABLE is given by length of string - 1 (since index starts from 0)
		int maxPosition = REFERENCE_TABLE.length() - 1; // 44
		// Adjust offset position if it exceeds length of REFERENCE_TABLE
		if (offsetPosition >= REFERENCE_TABLE.length()) {
			offsetPosition %= REFERENCE_TABLE.length();
		}
		// Generate the Shift Table which consist of 3 parts:
		// 1) The part at the end of the REFERENCE_TABLE that exceeds the length 44 due to right shifting => Given by index from (maxPosition - offsetPosition + 1) due to indexing from 0
		// 2) The part from index 0 to (offsetPosition - 1)
		// 3) The part from index offsetPosition to end (maxPosition + 1) (due to index from 0)
		String shiftTable = REFERENCE_TABLE.substring(maxPosition - offsetPosition + 1) // part 1
				+ REFERENCE_TABLE.substring(0, offsetPosition) // part 2 (excluding offsetPosition)
				+ REFERENCE_TABLE.substring(offsetPosition, maxPosition + 1);
		// Ensure that length of shift table is the same as REFERENCE_TABLE as given by qns
		if (shiftTable.length() >= REFERENCE_TABLE.length()) {
			// Any values after the REFERENCE_TABLE's length will be duplicates and thus can be removed
			shiftTable = shiftTable.substring(0, REFERENCE_TABLE.length());
		}
		return shiftTable;
	}
	
	@Override
	public String encode(String plainText) throws InvalidTextException {
		StringBuilder encodedText = new StringBuilder();
		// Generate Encoded Shift Table based on offset char
		String encodedShiftTable = generateShiftTable(offsetCharacter);
		for (char c : plainText.toCharArray()) {
			if (c == ' ') {
				// if char == ' ', add ' ' to encodedText
				encodedText.append(' ');
			} else {
				// Get position of each character from REFERENCE_TABLE
				int index = REFERENCE_TABLE.indexOf(c);
				if (index != -1) {
					// If char is found from REFERENCE_TABLE, add the encoded char at index position wrt encodedShiftTable
					encodedText.append(encodedShiftTable.charAt(index));
				} else {
					throw new InvalidTextException("There is an error in input string");
				}
			}
		}
		return encodedText.toString();
	}

	@Override
	public String decode(String encodedText) throws InvalidTextException {
		StringBuilder decodedText = new StringBuilder();
		// Generate decoded Shift Table based on offset char
		String decodedShiftTable = generateShiftTable(offsetCharacter);
		for (char c : encodedText.toCharArray()) {
			if (c == ' ') {
				// if char == ' ', add ' ' to decodedText
				decodedText.append(' ');
			} else {
				// Get position of each character from decodedShiftTable
				int index = decodedShiftTable.indexOf(c);
				if (index != -1) {
					// If char is found from decodedShiftTable, add the decoded char at index position wrt REFERENCE_TABLE
					decodedText.append(REFERENCE_TABLE.charAt(index));
				} else {
					throw new InvalidTextException("There is an error in input string");
				}
			}
		}
		return decodedText.toString();
	}

}
