package com.part05;

import java.util.Scanner;

public class GCDLCM {

	/* 유클리드 호제법 - 최대공약수(GCD)를 구하는 알고리즘
	 *  a   b   r<-a를b로 나눈 나머지
	 * 152 68  20
	 * 68  20  8
	 * 20  8   4
	 * 8   4
	 *
	 * 최대공약수는 4
	 */
	
	/*
	 *  최소공배수(LCM) 구하는 법
	 *  
	 *  2 | 168  86
	 *  	-------
	 *       84  43  => 2   * 84 	  * 43     = LCM
	 * 					GCD * (A/GCD) * (B/GCD)
	 *  A = aGCD		a = A/GCD -> 무조건 정수로 나누어 떨어짐
	 *  B = bGCD		b = B/GCD -> 무조건 정수로 나누어 떨어짐
	 *  LCM = abGCD
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A = a;				//최소공배수에 사용할 복사본
		int B = b;
		
		int r = 0;
		int GCD = 0; 			//최대공약수
		int LCM = 0; 			//최소공배수
		System.out.print("a  b  r \n");
		while(true) {
			
			r = a%b;
			System.out.printf("%d  %d  %d \n", a,b,r);
			if(r==0) {
				GCD = b;
				break;
			}
			a = b;
			b = r;
		}
		System.out.println("최대공약수 : "+GCD);
		
		LCM = (A/GCD)*(B/GCD)*GCD;		// LCM = (A/GCD)*(B/GCD)*GCD
		
		System.out.println("최소공배수 : "+LCM);
		
		
	}






}
