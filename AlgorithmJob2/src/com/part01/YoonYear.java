package com.part01;

import java.util.Scanner;

public class YoonYear {

	public static void main(String[] args) {
		
		// 1. 4�� ����̸� 100����� �ƴ�
		// 2. 400�� ����� ����
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N%4==0 && N%100!=0) System.out.println("YES");
		else if(N%400==0) System.out.println("YES");
		else System.out.println("NO");
		
	}
}
