package com.part05;

import java.util.Scanner;

public class PROSJECK {

	/*
	 * 민건이는 수학 수업시간동안 재밌는 방법으로 수학을 연습하고 있다.

		먼저 민건이는 정수 수열 A를 작성했다.
		
		그리고 나서 그 아래에 A의 해당 항까지의 평균값을 그 항으로 하는 정수 수열 B를 쓴다.
		
		예를 들어 , 만약 수열 A가 1, 3, 2, 6, 8 이라면 수열 B는 1/1, (1+3)/2 , (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5 즉, 1, 2, 2, 3, 4 가 된다.
		
		수열 B가 주어졌을 때 수열 A를 구하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arrB[] = new int[n+1];		//수열 B
		
		for(int i=1; i<n+1; i++) {
			arrB[i] = sc.nextInt();
		}
		
		
		int arrA[] = new int[n+1];		//수열 A
		int sum = 0;
		for(int i=1; i<n+1; i++) {
			if(i==1) {
				arrA[i] = arrB[1];
				sum+=arrA[i];			//A[1]번째에 값을 넣어주고 sum에도 더해줘야 뒤에 숫자 sum을 뺄 때 영향을 준다.
				continue;
			}
			arrA[i] = arrB[i]*i - sum;
			sum+=arrA[i];
		}
		
		for(int i=1; i<n+1; i++) {
			System.out.print(arrA[i] + " ");
		}
		
	}
}
