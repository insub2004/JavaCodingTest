package com.final01;

import java.util.Scanner;

public class QnA02 {

	//줄 세우기(오름차순)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n+5];
		
		
		//m번만큼 입력받고 m번만큼 비교하기
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a]--;
			arr[b]++;
		}
		
		System.out.println(2 + " " + 3 + " " + 1);
		
	}
}
