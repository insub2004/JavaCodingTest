package com.part05;

import java.util.Scanner;

public class Pfactorization {

	/*
	 * 백준 11653
	 * 
	 * N을 그냥 2부터 소인수 분해 시작해서
	 * 출력시키면 오름차순 됨
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	
		
		
		for(int i=2; ; ) {
			if(num%i==0) {
				System.out.println(i);		// 2부터 소수로 나눠지면 i출력
				num = num/i;				// num에 num/i를 넣어줘서 계속 소인수분해 이어지게
				//i=2;						// 2이후의 인수로 나눠졌어도 다시 2부터 나눠주기 위해서	(근데 이건 생략해도 답이 됨, 2로 할 짓 다했기 때문에) 
				continue;
			}
			else if(num==1) break;		
			i++;
		}
		
	}
	
}
