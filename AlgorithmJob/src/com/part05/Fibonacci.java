package com.part05;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		/*
		 * fibonacci
		 * 문제
			피보나치 수열은 수학에서 아주 유명한 수열이다. 피보나치 수열을 이루는 수들을 피보나치 수라고 한다.
			
			피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
			
			이를 식으로 써보면 F(n)= F(n-1) + F(n-2), (n>=2)가 된다.
			
			n이 0 ~ 15일때 까지 피보나치 수를 써보면 다음과 같다.
			
			0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
			
			n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
			
			 
			
			입력
			첫째 줄에 n이 주어진다. (0 ≤ n ≤ 45)
			
			 
			
			출력
			첫째 줄에 n번째 피보나치 수를 출력한다.  
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[]=new int[n+1];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<n+1; i++) {
			arr[i] = arr[i-2]+arr[i-1];
		}
		
		System.out.println(arr[n]);
		
	}
}
