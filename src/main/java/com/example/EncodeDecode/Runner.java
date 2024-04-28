package com.example.EncodeDecode;

public class Runner {

	public static void main(String[] args) throws InvalidTextException {
		// if offset character is 'B'
		System.out.println("~~~~~~~~~~~~~~ OFFSET CHARACTER == 'B' ~~~~~~~~~~~~~~~~~~~~~~~");
		EncodeDecode ed1 = new EncodeDecode('+');
		String res1 = ed1.encode("HELLO WORLD");
		System.out.println("Encoded Text with offset character 'B': " + res1);		
		String rev1 = ed1.decode(res1);
		System.out.println("Decoded Text with offset character 'B': " + rev1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		// if offset character is 'F'
		System.out.println("~~~~~~~~~~~~~~ OFFSET CHARACTER == 'F' ~~~~~~~~~~~~~~~~~~~~~~~");
		EncodeDecode ed2 = new EncodeDecode('F');
		String res2 = ed2.encode("HELLO WORLD");
		System.out.println("Encoded Text with offset character 'F': " + res2);		
		String rev2 = ed2.decode(res2);
		System.out.println("Decoded Text with offset character 'F': " + rev2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

	}

}
