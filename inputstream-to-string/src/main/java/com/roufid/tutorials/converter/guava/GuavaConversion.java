package com.roufid.tutorials.converter.guava;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.springframework.stereotype.Component;

import com.google.common.io.CharStreams;
import com.roufid.tutorials.converter.InputStreamToStringConverter;

@Component
public class GuavaConversion implements InputStreamToStringConverter {

	@Override
	public String convert(InputStream inputStream, Charset charset) throws IOException {
		return CharStreams.toString(new InputStreamReader(inputStream, charset));
	}

}
