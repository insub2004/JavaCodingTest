package com.part02;

import java.util.Scanner;

public class Qn2101 {

	//maxofarr �迭 �Ⱦ��� Ǯ��
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int max = 0;
		int iy = 0;
		int jx = 0;
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				a = sc.nextInt();
				if(a>max) {
					max = a;
					iy = i;
					jx = j;
				}
			}
		}
		
		System.out.println(max + "\n" + iy + " " + jx);
		
	}
}
