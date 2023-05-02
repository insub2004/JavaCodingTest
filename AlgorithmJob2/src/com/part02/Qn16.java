package com.part02;

import java.util.Scanner;

public class Qn16 {

	//Car
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			if(num==day) cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
