package com.part01;

import java.util.Scanner;

public class OddPlusEvenMinus {

	public static void main(String[] args) {
		
		
		/*
		 * 두 개의 자연수 A, B가 주어진다. 
		 * 이제 A부터 B까지 모든 숫자에 대하여 홀수는 더하고 짝수는 뺀 결과를 출력하는 프로그램을 작성하시오. 
		 * 단, A <= B라고 가정한다.
		 * 입력
		 * 첫 번째 줄에 A, B가 주어진다. (1 <= A <= B <= 1000)
		 * 출력
		 * A부터 B까지 모든 숫자에 대하여 홀수는 더하고 짝수는 뺀 결과를 출력한다.
		 */
		//입력 출력 예제
		//3 8
		//-3
		
		//4 4
		//-4
		
		Scanner sc = new Scanner(System.in);
		
		//값 입력받기
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//마지막 값 출력 경우
		int flag = 0;
		
		//홀수는 홀수끼리 짝수는 짝수끼리
		int odd = 0;
		int even = 0;

		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
			flag=1;
		}
		
		/*
		if(flag==1) {
			System.out.println(odd-even);
		}else {
			if(a==b && a%2==0) {		//짝수일 경우
				System.out.println(-a);
			}else if(a==1 && b==1){
				System.out.println(1);
			}else {
				System.out.println(a);
			}
		}
		*/
		// a,b가 같은 경우에 반복문이 1회 동작해서 문제가 없다!!!!!!
		System.out.println(odd-even);
	}
}
