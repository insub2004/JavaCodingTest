package com.d2;

import java.util.Scanner;

public class Qn1288 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int total = sc.nextInt();
			System.out.printf("#%d %d\n", test_case, total/3);
		}
	}
}
