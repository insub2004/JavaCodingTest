package com.part01;
import java.util.Scanner;

public class NtoMSecond {
	public static void main(String[] args) {
		//문제
		//N부터 M까지 출력하는 프로그램을 작성해보자.
		
		//입력
		//첫째 줄에 자연수 N과 자연수 M이 공백을 가지고 주어진다. (N ≤ M ≤ 1,000)
		
		//출력
		//첫째 줄에 N부터 M까지의 자연수를 공백을 사이에 두고 차례대로 출력한다.
		//(단, 한 줄에 최대 8개씩 출력해야 한다.)
		
		//입력 예제
		//500 512
		//출력 예제
		/*
		500 501 502 503 504 505 506 507
		508 509 510 511 512
		 */
		
		//입력받기
		//숫자 하나 출력 카운트변수 == 8 이면 줄바꾸기
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		
		for(int i = N; i<=M; i++) {
			if(cnt != 7) {
				System.out.print(i);
				System.out.print(" ");
				cnt++;
			}else if(cnt==7) {
				System.out.print(i);
				System.out.println();
				cnt=0;
			}
		}
		
		
	}
}
