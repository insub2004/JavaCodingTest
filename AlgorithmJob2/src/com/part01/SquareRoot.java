package com.part01;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		while(true) {
			if(i*i>=n) break;
			i++;
		}
		System.out.println(i);
		
	}
}
