package com.part01;

import java.util.Scanner;

public class SaveMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int goal = sc.nextInt();
		int sum = 0;
		int day = 0;

		for(int i=1; ;i++) {
			sum+=i;
			if(sum>=goal) {
				day = i;
				break;
			}
		}
		
		System.out.println(day);
	}
}
