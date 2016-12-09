package com.roufid.tutorials.converter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Interface exposing a method to convert an InputStream to a String.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface InputStreamToStringConverter {

	public String convert(InputStream inputStream, Charset charset) throws IOException;
}
