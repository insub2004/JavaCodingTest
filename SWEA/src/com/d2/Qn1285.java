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
			int min = 100001;	//100001���ٴ� ������ �������ϱ� 
			int cnt = 0;
			for(int i=0; i<n; i++) {
				int val = Math.abs(sc.nextInt());
				if(min>val) {
					cnt=0;		//���ο� �ּڰ� ���°Ŵϱ� cnt�ʱ�ȭ
					min = val;
					cnt++;
				}else if(min == val) cnt++;
			}
			
			System.out.printf("#%d %d %d", test_case, min, cnt);
			System.out.println();
		}
	}
}
