package com.final01;

import java.util.Scanner;

public class QnA01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] month = new int[13];	//월 배열
		month[2] = 29;
		for(int i=1; i<8; i+=2) {
			month[i] = 31;
		}
		for(int i=4; i<8; i+=2) {
			month[i] = 30;
		}
		for(int i=8; i<13; i+=2) {
			month[i] = 31;
		}
		for(int i=9; i<13; i+=2) {
			month[i] = 30;
		}

		
		int m = sc.nextInt();	//월 입력
		int d = sc.nextInt();	//일 입력
		
		int sum = d;	//일을 미리 더해준 상태
		
		for(int i=0; i<m; i++) {
			sum += month[i];	//월 만큼 더해주기
		}
		
		int ans = sum%7;

		switch (ans) {
		case 0:
			System.out.println("Wednesday");
			break;
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
		}
	}
}
