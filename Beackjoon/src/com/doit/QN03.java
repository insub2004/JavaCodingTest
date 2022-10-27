package com.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QN03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int sNo = Integer.parseInt(stringTokenizer.nextToken());
		int qNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] S = new long[sNo + 1];
		
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		//인덱스가 1부터인 합배열 생성
		for(int i=1;i<=sNo;i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for(int q=0; q<qNo; q++) {
			
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			
			int i = Integer.parseInt(stringTokenizer.nextToken());
			
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			System.out.println(S[j] - S[i-1]);
			
		}
		
		
	}
}
