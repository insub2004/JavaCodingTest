package com.part02;

import java.util.Scanner;

public class FindSecondMinValue {

	public static void main(String[] args) {
		
		/*
		 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 두 번째 최솟값을 찾고, 
		 * 그 두 번째 최솟값이 몇 번째 수인지를 구하는 프로그램을 작성하시오. 
		 * 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 
		 * 이들 중 두 번째 최솟값은 12이고, 이 값은 4번째 수이다.
		 * 
		 * 입력
		 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 10,000,000 보다 작다.
		 * 
		 * 출력
		 * 첫째 줄에 두 번째 최솟값을 출력하고, 둘째 줄에 두 번째 최솟값이 몇 번째 수인지를 출력한다.
		 * 
		 * 입출력 예시
		 *  3
			29
			38
			12
			57
			74
			40
			85
			61
			
			12
			4
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		/*
		for(int i:arr) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		//제일 작은 최솟값과 인덱스
		int min = arr[0];
		int minIndex = 0;
		
		//우선 제일 최솟값과 최솟값의 인덱스를 찾기
		for(int i=0; i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		
		//두번째로 작은 최솟값과 인덱스
		int minnd;
		if(minIndex==0) minnd=arr[1];
		else minnd=arr[0];
		
		int minndIndex = 0;
		
		//찾은 제일 최솟값의 인덱스값을 만나면 무시해서 두번째로 작은 최솟값 찾기
		for(int i=0; i<arr.length; i++) {
			if(i==minIndex) continue;
			if(minnd>arr[i]) {
				minnd=arr[i];
				minndIndex = i;
			}
		}
		
		System.out.println(minnd);
		System.out.println(minndIndex+1);	//출력 예시 끝까지 잘보기
		
	}
}
