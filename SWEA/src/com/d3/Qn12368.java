package com.d3;

import java.util.Scanner;

public class Qn12368 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A+B==24) System.out.printf("#%d 0", test_case);
			else if(A+B<24) System.out.printf("#%d %d", test_case, A+B);
			else System.out.printf("#%d %d", test_case, (A+B)-24);
		
		}
	}
}
