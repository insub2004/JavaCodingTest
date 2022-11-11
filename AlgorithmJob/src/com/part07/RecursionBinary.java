package com.part07;

import java.util.Scanner;

public class RecursionBinary {

	// �������� �ٲٴ� ����Լ��� �����ض�
	// 1) binary(n)�� n�� �������� �ٲٴ� �Լ��̴�.
	// 2) binary(1) == 1 binary(0) == 0
	// 3) binary(n) = binary(n/2) + (n%2)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		binary(n);
	}

	private static void binary(int n) {
		
		if(n==1) System.out.print("1");
		else if(n==0) System.out.print("0");
		else {
			binary(n/2);
			System.out.printf("%d", n%2);
		}
	}
}
