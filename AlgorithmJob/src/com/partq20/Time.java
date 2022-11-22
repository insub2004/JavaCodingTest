package com.partq20;

import java.util.Scanner;

public class Time {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int h = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			h+=x;
			m+=y;
			/*
			//분계산
			if(m>=60) {
				h++;
				m-=60;
			}
			//시 계산
			//12시 59분 + 12 59
			//24시 118분
			//->25시 58분		분 계산
			//->13시 58분		시 계산 1번
			//->1시 58분		시 계산 2번
			while(h>12) h-=12;
			*/
			
			h+=m/60;
			m%=60;
			
			h%=12;
			if(h==0) h=12;
			
			System.out.printf("#%d %d %d\n",test_case,h,m);
			
		}
	}
}
