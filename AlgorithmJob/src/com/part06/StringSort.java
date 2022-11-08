package com.part06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class StringSort {

	// Array.sort 활용하자
	
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
