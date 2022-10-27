package com.part03;

import java.util.Scanner;

public class GCDLCMRe {

	public static void main(String[] args) {
		
		/*
		 * 	문제
			두 개의 자연수를 입력받아 최대공약수(GCD)와 최소공배수(LCM)를 출력하는 프로그램을 작성하시오.  
			
			입력
			첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000 이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
			
			 
			
			출력
			첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소공배수를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//최대공약수용
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//최소공배수용
		int A = a;
		int B = b;
		
		//유클리드 호제법을 이용해서 최대공약수 구하기
		while(true) {
			int c = a%b;
			if(c==0) break;
			a=b;
			b=c;
		}
		
		int GCD = b;
		
		int LCM = (A/b)*(B/b)*b;
		
		System.out.print(GCD+"\n"+LCM);
		
		
	}
}
