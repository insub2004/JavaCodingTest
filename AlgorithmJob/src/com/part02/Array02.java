package com.part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Array02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int A[][] = new int[h][r];
		
		for(int i=0;i<h;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<r;j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}	
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		System.out.println(A[x][y]);
	}
}
