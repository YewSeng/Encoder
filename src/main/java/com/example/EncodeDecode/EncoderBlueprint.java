package com.example.EncodeDecode;


public interface EncoderBlueprint {

	String encode (String plainText) throws InvalidTextException;
	String decode (String encodedText) throws InvalidTextException;
}
