package com.part07;

import java.util.Scanner;

public class PrintBinary {

	// x�� 2������ �ٲ㼭 ���
	// printBinary�� x�� 2������ �ٲ㼭 ����ϴ� �Լ�
	// printBinary(1)==1 printBinary(0) == 0
	// printBinary(x) = printBinary(x/2) + (x%2)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		PrintBinary(x);
		
	}

	private static void PrintBinary(int x) {
		// x�� �������� �ٲپ� ����ϴ� �Լ�
		// 10   p(5)+0
		// p(5) p(2)+1
		// p(2) p(1)+0
		// p(1)   1	-> 10 -> 101 -> 1010
		
		if(x==1) System.out.print("1");
		else if(x==0) System.out.print("0");
		else {
			PrintBinary(x/2);
			System.out.printf("%d", x%2);
		}
	}
	
}
