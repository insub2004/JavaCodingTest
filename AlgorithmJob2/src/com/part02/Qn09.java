package com.part02;

import java.util.Scanner;

public class Qn09 {

	//점수 계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//총점
		int sum = 0;
		//현재 점수
		int score = 0;

		for(int i=0; i<arr.length;i++) {
			if(arr[i]==1) {
				score++;
				sum+=score;
			}else {
				score = 0;
			}
		}
		System.out.println(sum);
	}
	
}
