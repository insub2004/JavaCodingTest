package com.d2;

import java.util.Scanner;

public class Qn1284 {

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int p = sc.nextInt();	//A사 1리터당 p원
			int q = sc.nextInt();	//B사 기본요금 q원
			int r = sc.nextInt();	//기본요금 기준 월간 사용량 r리터
			int s = sc.nextInt();	//기본요금 초과시 1리터당 s원씩 추가
			int w = sc.nextInt();	//한 달간 수도 사용량!!
			
			int aPrice = p*w;
			int bPrice = 0;
			if(w<=r) bPrice = q;	// B사 기준 한 달 사용량이 r리터 이하인 경우 기본요금
			else if(w>r) bPrice = q + (w-r)*s;	//B가 시준 한 달 사용량이 r리터 초과시 
												//기본요금 + 초과한 만큼*s
			System.out.printf("#%d %d\n", test_case, Math.min(aPrice, bPrice));
		}
	}
}
