package com.part02;

import java.util.Scanner;

public class Qn05 {

	//역으로 출력하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=size-1; i>=0; i--) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
