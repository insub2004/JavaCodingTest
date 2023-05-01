package com.part01;

import java.util.Scanner;

public class YoonYear {

	public static void main(String[] args) {
		
		// 1. 4의 배수이며 100배수는 아님
		// 2. 400의 배수인 연도
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N%4==0 && N%100!=0) System.out.println("YES");
		else if(N%400==0) System.out.println("YES");
		else System.out.println("NO");
		
	}
}
