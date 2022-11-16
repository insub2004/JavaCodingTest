package com.q20;

import java.util.Scanner;

public class Nminus1Game {

	//22번
	//범위 확인 잘하자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			int re[] =new int[n-1];
			
			for(int i=0; i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<re.length;i++) {
				re[i] = -1*(arr[i] - arr[i+1]);
			}
			int max = re[0];
			int min = re[0];
			for(int i=1; i<re.length; i++) {
				if(max < re[i]) max = re[i];
				if(min > re[i]) min = re[i]; 
			}
			System.out.printf("#%d %d %d\n", t, max, min*-1);
			
		}
		
	}
}
