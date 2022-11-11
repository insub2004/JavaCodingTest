package com.d1;

import java.util.Scanner;

public class Qn2070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			/*
			if(a>b) System.out.printf("#%d >\n", test_case);
			else if(a<b) System.out.printf("#%d <\n",test_case);
			else System.out.printf("#%d =\n",test_case);
			*/
			
			//다른사람 풀이
			char ch = a > b ? '>' : (a < b ? '<' : '=');
            System.out.println("#" + test_case + " " + ch);
		}
		
	}
}
