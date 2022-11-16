package com.q20;

import java.util.Scanner;

public class Pangram {

	public static int arr[];
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			
			arr = new int[10];
			
			boolean flag = true;
			int val = 0;
			int ans = 0;
			int cnt = 0;
			int i=1;
			while(flag) {
				val = n*i;
				
				cnt = getCnt(val);
				
				if(cnt==10) {
					ans = val;
					flag = false;
				}
				i++;
			}
			System.out.printf("#%d %d\n", test_case,ans);
		}
	}
	private static int getCnt(int val) {
		int cnt = 0;
		
		while(val>0) {
			arr[val%10] = 1;
			val/=10;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) cnt++;
		}
		
		return cnt;
	}
}
