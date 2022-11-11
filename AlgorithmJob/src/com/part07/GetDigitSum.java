package com.part07;

import java.util.Scanner;

public class GetDigitSum {

	// �� �ڸ����� ��
	// 12321-> 1232�� �� �ڸ����� �� + 1
	// 1232 -> 123�� �� �ڸ����� �� + 2
	
	// 1) getDigitSum(x)�� x�� �� �ڸ����� ���� ��ȯ�ϴ� �Լ�
	// 2) getDigitSum(x)=x x�� ���ڸ��� ��
	// 3) getDigitSum(x) = getDigitSum(x/10) + (x%10)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(getDigitSum(n));
		
	}

	private static int getDigitSum(int n) {
		
		if(n/10 == 0) return n;			// if( 9>=n || n>0)
		else return getDigitSum(n/10) + (n%10);
	}
	
}
