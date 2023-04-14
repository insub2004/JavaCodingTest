package com.d2;

import java.util.Scanner;

public class Qn1945 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num = sc.nextInt();
			int[] arr = new int[]{2,3,5,7,11};
			int[] ans = new int[5];
			int idx = 0;
			while(num!=1) {
				if(num%arr[idx]!=0) {
					idx++;
					continue;
				}
				num = num/arr[idx];
				ans[idx]++;
			}
			System.out.printf("#%d %d %d %d %d %d", test_case, ans[0],ans[1],ans[2],ans[3],ans[4]);
		}
	}
}
