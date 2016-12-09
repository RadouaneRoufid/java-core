package com.roufid.tutorials.converter.nativejava;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.roufid.tutorials.converter.InputStreamToStringConverter;

@Component
public class ScannerConversion implements InputStreamToStringConverter {

	@Override
	public String convert(InputStream inputStream, Charset charset) throws IOException {
		
		try (Scanner scanner = new Scanner(inputStream, charset.name())) {
			scanner.useDelimiter("\\A");
			return scanner.hasNext() ? scanner.next() : "";
		}
	}

}
