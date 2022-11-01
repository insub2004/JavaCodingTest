package com.part03;

import java.util.Scanner;

public class ModeMean {

	// 최빈값, 평균 구하기
	
	/*
	 *	입력
		첫째 줄부터 열 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 1,000 이하의 10 의 배수이다.

 

		출력	
		첫째 줄에는 평균을 출력하고, 둘째 줄에는 최빈값을 출력한다. 최빈값이 둘 이상일 경우 그 중 최소값을 출력한다. 평균과 최빈값은 모두 자연수이다.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];	//입력받을 값들의 배열
		
		int sum = 0;					
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		int avg = sum/10;		//평균값
		
		
		
	}
	
}
