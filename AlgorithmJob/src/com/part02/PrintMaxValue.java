package com.part02;

import java.util.Scanner;

public class PrintMaxValue {

	public static void main(String[] args) {
		
		/*
		 * 서로 다른 자연수 세 개를 입력받고 최댓값을 찾는 프로그램을 작성해보세 요.  
		 * 
		 * 입력
		 * 세 개의 자연수가 주어집니다.
		 * 
		 * 출력
		 * 최댓값을 찾아 예시와 같이 출력합니다.
		 * 
		 * 입출력예제
		 * 3 4 5
		 * 최댓값은 5입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxVal = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		
		System.out.printf("최댓값은 %d입니다", maxVal);
	}
}
