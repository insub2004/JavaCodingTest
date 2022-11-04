package com.part05;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		
		//소인수 분해
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 소수 2 3 5 7 11 13.... 소수의 리스트를 굳이 다 몰라도 된다.
		// 그냥 정수 2부터 다 나누어 보자. -> 만약 4까지 갔다고 해도 이미 2로 할 수 있을만큼 했기 때문에 절대 4로 나누어 떨어질 수가 없다.
		
		/*	// 내 풀이
		int namugi = n;					// 소수 나눠졌을 질 때 나눠지고 난 뒤의 몫을 계속 사용하기 위해 변수에 저장
		for(int i=2;i<=namugi;i++) {	// 2~나눠지고 난 뒤의 몫까지 계속 소수로 나눠지는지 판별해야 함으로 
			if(namugi%i == 0) {
				System.out.printf("%d ", i);
				namugi = namugi/i;		// 몫 넣기
				i = 1;					// 소수 판별할 때 2부터 나눠봐야하는데 for문의 증감부분 때문에 i=1로 해야 2부터 다시 나눈다.
			}
		}
		*/
		
		// 강사님 풀이
		// for 범위나 증감식을 생략, 참고해볼 것
		
		for(int i=2; n>1;) {
			if(n%i==0) {
				System.out.printf("%d ", i);
				n/=i;
			}
			else i++;
		}
		
	}
}
