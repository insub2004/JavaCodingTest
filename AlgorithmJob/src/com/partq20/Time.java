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
			//�а��
			if(m>=60) {
				h++;
				m-=60;
			}
			//�� ���
			//12�� 59�� + 12 59
			//24�� 118��
			//->25�� 58��		�� ���
			//->13�� 58��		�� ��� 1��
			//->1�� 58��		�� ��� 2��
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
