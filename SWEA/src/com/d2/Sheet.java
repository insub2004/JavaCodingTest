package com.d2;

import java.util.Scanner;

public class Sheet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N=1295;
		int arr[] = new int[10];
		int loop = Integer.toString(N).length();
		System.out.println(loop);
		for(int j=1; j<loop; j++) {
			int num = N%10;
			N = N/10;
			arr[num] = 1;
			if(j==loop-1) arr[N] = 1;
			System.out.printf("³ª¸ÓÁö:%d  ¸ò:%d",num,N);
		}
		System.out.println();
		for(int a:arr) {
			System.out.print(a);
		}
	}
	
}
