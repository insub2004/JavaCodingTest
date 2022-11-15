package com.partFinal;

import java.util.Scanner;

public class Qa0101 {

	/*
	 * 1: ��
	 * 2: ��
	 * 3: ��
	 * 4: ��
	 * 5: ��
	 * 6: ȭ
	 * 0: ��
	 * 
	 * D%7 -> ����
	 * 
	 * 1.31 -> 31%7 -> 3
	 * 2.1 -> 32��
	 * 2.2 -> 33��
	 * 2.29 -> d + 31
	 * 3 -> d + 29 + 31
	 * 4 -> d + 31 + 29 + 31
	 * .... �迭�� [31, 29, 31, 30 ...] ����� ����
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int D = sc.nextInt();
		
		int days[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i=1; i<M; i++) {
			D += days[i];
		}
		
		int ans = D%7;
		
		switch (ans) {
		case 1:
			System.out.println("Thursday");
			break;
		case 2:
			System.out.println("Friday");
			break;
		case 3:
			System.out.println("Saturday");
			break;
		case 4:
			System.out.println("Sunday");
			break;
		case 5:
			System.out.println("Monday");
			break;
		case 6:
			System.out.println("Tuesday");
			break;
		case 0:
			System.out.println("Wednesday");
			break;
		}
		
	}
}
