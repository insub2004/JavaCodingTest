package com.d1;

import java.util.Scanner;

public class Qn1936 {

	// 가위바위보
	// 가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.
	// A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 1:가위 2:바위 3:보 , 비기는 경우 없음
		switch (A) {
		case 1:
			if(B==2) System.out.println('B');
			else if(B==3) System.out.println('A');
			break;
		case 2:
			if(B==1) System.out.println('A');
			else if(B==3) System.out.println('B');
			break;
		case 3:
			if(B==1) System.out.println('B');
			else if(B==2) System.out.println('A');
			break;
		}
		
	}
}
