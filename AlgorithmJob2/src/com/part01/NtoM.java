package com.part01;

import java.util.Scanner;

public class NtoM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		while(n<=m) {
			System.out.print(n+" ");
			n++;
		}
	}
}
