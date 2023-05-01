package com.part01;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		for(int i=0; i<3; i++) {
			int a = sc.nextInt();
			if(max<=a) max = a;
		}
		
		System.out.println(max);
		
	}
}
