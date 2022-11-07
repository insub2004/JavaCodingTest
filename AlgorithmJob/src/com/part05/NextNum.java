package com.part05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class NextNum {

	// 백준 4880
	// 등차AP 등비GP
	/*
	 * 문제점
	 * 1. 입력의 갯수가 정해지지 않을 때 대처하기
	 * 2. 간결한 알고리즘
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) {	// 0 0 0 이 입력되면 종료
				break;				
			}
			
			int m = b - a;
			int n = c - b;
			
			String result = (m == n) ? ("AP "+(c+n)):("GP "+ c*(b/a));  
		
			System.out.println(result);
		}
		
		br.close();
		
	}
}
