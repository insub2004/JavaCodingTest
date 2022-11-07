package com.part05;

import java.util.Scanner;

public class FindPrime {

	/*
	 * 문제
		주어진 숫자들 중 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.  
		
		입력
		첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 줄에 걸쳐 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
		
		 
		
		출력
		주어진 수들 중 소수의 개수를 출력한다.
	 * 
	 */
	static int result = 0;
	
	public static int prime(int a) {
		
		result = 0;				// 초기화 생각하자!!!!!!!
		
		for(int i=2; i<a; i++) {
			if(a%i == 0) {
				result = 1;		// 소수가 아니면 1
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]<=1) continue;
			prime(arr[i]);
			if(result == 0) cnt++;
		}
		
		System.out.println(cnt);
		
		
	}
}
