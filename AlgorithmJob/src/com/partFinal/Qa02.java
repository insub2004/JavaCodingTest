package com.partFinal;

import java.util.Scanner;

public class Qa02 {
	
	static public int n;
	static public int arr[] = new int[100010];
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			/*
			 * 1) 첫 번째 수는 무조건 두번째 수와 같이 빠진다 => 첫번째 수가 두번째 수보다 크다면 불가능.
			 * 
			 * 9 8 7 6
			 * 
			 * 2) 첫번째 수보다 두번째 수보다 크다면 => 그 차이만큼 2,3자리수을 빼줘야 한다
			 */
			
			n = sc.nextInt();
			long val = 0;
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=1; i<n; i++) {
				if(arr[i]>arr[i-1]) {
					if(i == n-1) {			//맨 뒤의 앞이 홀수면 불가능
						val = -1;
						break;
					}
					val += 2*(arr[i]-arr[i-1]);
					arr[i+1] -= arr[i] - arr[i-1];
					arr[i] = arr[i-1];
				}else if(arr[i] < arr[i-1]) {
					if(i%2 == 1) {
						val = -1;
						break;
					}
					val += i*(arr[i-1] - arr[i]);
				}
			}
			System.out.println(val);
		}
	}
}
