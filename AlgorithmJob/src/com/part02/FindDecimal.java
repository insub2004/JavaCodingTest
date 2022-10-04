package com.part02;

import java.util.Scanner;

public class FindDecimal {

	public static void main(String[] args) {
		/*
		 * 자연수n,m이 주어질 때, n부터m까지 존재하는 소수를 모두 출력하는 프로그램을 작성하여라. 
		 * 여기서 소수란, 약수가 1과 자기자신밖에 존재하지 않는 수를 말한다.
		 */
		
		//입출력 예제
		//13 30
		//13 17 19 23 29
		
		//두 값 입력받고
		//for문으로 약수 판별해서 i출력 아니면 _출력
		
		 Scanner sc = new Scanner(System.in);
		 
		 int min = sc.nextInt();
		 int max = sc.nextInt();
		 
		 int cnt = 0;
		 
		 for(int i=min; i<=max; i++) {
			 for(int j=2; j<=i-1; j++) {
				 if(i%j==0) cnt++;
			 }
			 if(cnt!=0) cnt=0;
			 else if(i==1) continue;	//min값이 1일 경우 제외시키기
			 else {
				 
				 cnt = 0;
				 System.out.print(i);
				 System.out.print(" ");
			 }
		 }
	}
}
