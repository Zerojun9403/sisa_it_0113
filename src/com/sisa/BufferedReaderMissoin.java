package com.sisa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderMissoin {

	public static void main(String[] args) throws IOException {
		// 생성자 BufferedReader(Reader in)
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);
		
		br.readLine();
	}

}
