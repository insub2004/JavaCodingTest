package com.doit;

import java.util.Scanner;

public class Sheet {

	public static void main(String[] args) {
		int n = 5;
		
		
		for(int i=0; i<n; i++) {
			printSpace(n-i-1);
			printStar(i+1);
		}
		printNewLine();
	}
	static void printNewLine() {
		System.out.println();
	}
	static void printSpace(int i) {
		for(int j=0; j<i; j++) {
			System.out.print(" ");
		}
	}
	static void printStar(int i) {
		for(int k=0; k<i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
