package com.example.EncodeDecode;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class EncodeDecodeTest {
	@Test
	@DisplayName("Test encode method - 'B'")
    public void testEncodeUsingB() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('B');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("GDKKN VNQKC", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - 'B'")
    public void testDecodeUsingB() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('B');

        // Act
        String decodedText = encodeDecode.decode("GDKKN VNQKC");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - 'F'")
    public void testEncodeUsingF() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('F');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("C/GGJ RJMG.", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - 'F'")
    public void testDecodeUsingF() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('F');

        // Act
        String decodedText = encodeDecode.decode("C/GGJ RJMG.");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	// Edge cases
	@Test
	@DisplayName("Test encode method - 'A'")
    public void testEncodeUsingA() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('A');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("HELLO WORLD", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - 'A'")
    public void testDecodeUsingA() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('A');

        // Act
        String decodedText = encodeDecode.decode("HELLO WORLD");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - 'N'")
    public void testEncodeUsingN() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('N');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("*9..B JBE.8", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - 'N'")
    public void testDecodeUsingN() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('N');

        // Act
        String decodedText = encodeDecode.decode("*9..B JBE.8");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - 'Z'")
    public void testEncodeUsingZ() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('Z');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("0X447 -7(4W", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - 'Z'")
    public void testDecodeUsingZ() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('Z');

        // Act
        String decodedText = encodeDecode.decode("0X447 -7(4W");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - '0'")
    public void testEncodeUsing0() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('0');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("ZW336 ,693V", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - '0'")
    public void testDecodeUsing0() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('0');

        // Act
        String decodedText = encodeDecode.decode("ZW336 ,693V");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - '5'")
    public void testEncodeUsing5() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('5');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("URYY1 914YQ", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - '5'")
    public void testDecodeUsing5() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('5');

        // Act
        String decodedText = encodeDecode.decode("URYY1 914YQ");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - '9'")
    public void testEncodeUsing9() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('9');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("QNUUX 5X0UM", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - '9'")
    public void testDecodeUsing9() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('9');

        // Act
        String decodedText = encodeDecode.decode("QNUUX 5X0UM");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - '('")
    public void testEncodeUsingBrackets() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('(');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("PMTTW 4WZTL", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - '('")
    public void testDecodeUsingBrackets() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('(');

        // Act
        String decodedText = encodeDecode.decode("PMTTW 4WZTL");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - '+'")
    public void testEncodeUsingPlus() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('+');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("MJQQT 1TWQI", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - '+'")
    public void testDecodeUsingPlus() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('+');

        // Act
        String decodedText = encodeDecode.decode("MJQQT 1TWQI");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
	
	@Test
	@DisplayName("Test encode method - '/'")
    public void testEncodeUsingSlash() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('/');

        // Act
        String encodedText = encodeDecode.encode("HELLO WORLD");
        
        // Assert
        assertEquals("IFMMP XPSME", encodedText);
    }
	
	@Test
	@DisplayName("Test decode method - '/'")
    public void testDecodeUsingSlash() throws InvalidTextException {
        // Arrange
        EncodeDecode encodeDecode = new EncodeDecode('/');

        // Act
        String decodedText = encodeDecode.decode("IFMMP XPSME");
        
        // Assert
        assertEquals("HELLO WORLD", decodedText);
    }
}
