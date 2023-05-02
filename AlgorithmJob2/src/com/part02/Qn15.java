package com.part02;

import java.util.Scanner;

public class Qn15 {

	//array3
	//1) 열이 오른쪽으로 진행할 때 마다 sum+=1씩 증가
	//2) 줄바꿈 할 때도 sum+=i씩 증가하면서 해당 행의 첫 열의 증가량 sum이기도함.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int start = 0;
		int idx = 0;
		
		for(int i=1; i<=n; i++) {
			start += i;	//행의 증가량
			sum = start;
			idx = i;	//열의 증가량
			for(int j=1; j<=n+1-i; j++) {
				System.out.print(sum+" ");
				sum+=idx++;
			}
			System.out.println();
		}
	}
}
