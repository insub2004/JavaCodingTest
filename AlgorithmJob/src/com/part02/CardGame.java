package com.part02;

import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		
		/*
		 * 다음은 게임의 한 예로, 각 라운드마다 A와 B가 제시한 카드의 숫자와 각 라운드의 승자를 보여준다. (비긴 라운드는 D로 표시함)
		 * 
		 * 입력
		 * 다음 정보가 표준 입력으로 주어진다. 첫 번째 줄 에는 A가 제시한 카드의 숫자 10개가 라운드 순서대로 주어지고, 
		 * 두 번째 줄에는 B가 제시한 카 드의 숫자 10개가 라운드 순서대로 주어진다.
		 * 
		 * 출력
		 * 다음 정보를 표준 출력으로 출력한다. 게임의 승 패가 결정되는 경우 승리한 사람을 출력하고, 비기는 경우에는 D를 출력한다.
		 * 
		 * 입출력 예제
		 * 6 7 5 1 4 10 2 3 8 9 
		 * 1 10 2 9 4 8 3 7 5 6
		 * 
		 * A
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//한 배열로 풀어보자
		int arr[] = new int[20];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//이길때 비길때 변수
		int a=0, b=0, d=0;
		
		
		//범위를 arr.length로 잡으면 i가 10되는 순간 [20]으로 가서 인덱스 에러
		for(int i=0;i<10;i++) {
			if(arr[i] > arr[i+10]) {
				a++;
			}else if(arr[i]<arr[i+10]){
				b++;
			}else if(arr[i]==arr[i+10]) {
				d++;
			}
		}
		
		if(a>b) {
			System.out.println("A");
		}else if(a==b) {
			System.out.println("D");
		}else {
			System.out.println("B");
		}
		
	}
}
