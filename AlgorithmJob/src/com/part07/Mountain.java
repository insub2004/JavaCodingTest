package com.part07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mountain {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		
		int n = Integer.parseInt(br.readLine());
		
		sb = new StringBuilder();
		
		mountain(n);
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
	private static void mountain(int n) {
		if(n==1) {
			sb.append(1);
		}
		else {
			mountain(n-1);
			sb.append(n);
			mountain(n-1);
		}
	}
}
