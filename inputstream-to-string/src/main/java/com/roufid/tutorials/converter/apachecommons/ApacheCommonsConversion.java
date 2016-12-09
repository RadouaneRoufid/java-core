package com.roufid.tutorials.converter.apachecommons;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import com.roufid.tutorials.converter.InputStreamToStringConverter;

@Component
public class ApacheCommonsConversion implements InputStreamToStringConverter {

	@Override
	public String convert(InputStream inputStream, Charset charset) throws IOException {
		return IOUtils.toString(inputStream, charset);
	}

}
