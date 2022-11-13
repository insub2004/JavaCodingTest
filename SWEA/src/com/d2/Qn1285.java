package com.d2;

import java.util.Scanner;

public class Qn1285 {

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int min = 100001;	//100001보다는 무조건 작을꺼니깐 
			int cnt = 0;
			for(int i=0; i<n; i++) {
				int val = Math.abs(sc.nextInt());
				if(min>val) {
					cnt=0;		//새로운 최솟값 들어온거니깐 cnt초기화
					min = val;
					cnt++;
				}else if(min == val) cnt++;
			}
			
			System.out.printf("#%d %d %d", test_case, min, cnt);
			System.out.println();
		}
	}
}
