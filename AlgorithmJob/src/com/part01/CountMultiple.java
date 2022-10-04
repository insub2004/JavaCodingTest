package com.part01;

import java.util.Scanner;

public class CountMultiple {

	public static void main(String[] args) {
		
		//문제
		/*
		 * 세 개의 자연수 A, B, C가 주어진다. 이 때, A부터 B까지 숫자 중에서 C의 배수의 개수를 출력하는 프로그램을 작성하시오.

		예를 들어, A = 3, B = 9, C = 2 라고 하자. 그러면 3부터 9까지 숫자 중 2의 배수의 개수이므로 4, 6, 8 총 3개가 존재한다. 따라서 3을 출력한다.

		또한, A = 10, B = 3, C = 4라고 하자. 그러면 10에서 3까지 숫자 중 4의 배수의 개수이므로 4, 8 총 2개가 존재한다. 따라서 2를 출력한다.
		 */
		
		//입력 예제
		//3 9 2
		//출력 예제
		//3
		//입력 예제
		//10 3 4
		//출력 예제
		//2
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 변수 3개 받기
		int A, B, C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		// cnt변수
		int cnt=0;
		
		// A,B 최솟값 최댓값 판별
		int min;
		int max;
		
		if(A>=B) {min=B;max=A;}
		else {min=A;max=B;}
		
		// cnt하나씩 증가시키며 A B 사이의 C의 배수 구하기
		for(int i=1;i*C<=max;i++) {
			if(i*C>=min && i*C<=max) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}
}
