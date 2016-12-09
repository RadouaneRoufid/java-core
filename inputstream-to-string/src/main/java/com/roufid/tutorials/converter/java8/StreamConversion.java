package com.roufid.tutorials.converter.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.roufid.tutorials.converter.InputStreamToStringConverter;

@Component
public class StreamConversion implements InputStreamToStringConverter {

	@Override
	public String convert(InputStream inputStream, Charset charset) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, charset))) {
			return br.lines().collect(Collectors.joining(System.lineSeparator()));
		}
	}

}
