package com.part01;
import java.util.Scanner;

public class YoonYear {
	
	public static void main(String[] args) {
		
		//연도가 주어졌을 때, 그 연도가 윤년인지 아닌지를 판단하는 프로그램을 작성해보자.

		//1. 윤년은 4의 배수이며 100의 배수는 아닌 연도
		//2. 400의 배수인 연도
		
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();

		if(N%4==0 && N%100!=0) {
			System.out.println("Yes");
		}else if(N%400==0) System.out.println("Yes");
		else {
			System.out.println("No");
		}

	}	
}
