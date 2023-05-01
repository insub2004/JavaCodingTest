package com.part02;

import java.util.Scanner;

public class Qn0801 {

	public static void main(String[] args) {
		
		//두 번째 최솟값 찾기
		//선택정렬 안쓰고 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//첫 번째로 작은 자연수
		int min01 = 10000000;
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(min01>arr[i]) {
				min01 = arr[i];
				idx = i;
			}
		}
		//두 번재로 작은 자연수
		int min02 = 10000000;
		for(int i=0; i<arr.length; i++) {
			if(i==idx) continue;
			if(min02>arr[i]) {
				min02 = arr[i];
				idx = i;
			}
		}
		System.out.println(min02);
		System.out.println(idx+1);
	}
}
