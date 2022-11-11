package com.recursion;

import java.util.Scanner;

public class Binary {

	/*
	 * ����
	���ڸ� �Է� �޾� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù ��° �ٿ� ���ڸ� �Է� �޴´�. ������ ũ��� 1,000���� �۰ų� ����.
	
	���
	ù° �ٿ� ���ڸ� �������� �ٲپ� ����Ѵ�.
	
	���� �Է�
	14
	���� ���
	1110
	
	��ͷ� Ǯ���
	 */
	
	/*
	 * 1)getBinary(n)�� 2������ ����ϴ� �Լ��̴�.
	 * 2)getBinary(1)==1�̰� binary(0)==0�̴�
	 * 3)getBinary(n) = binary(n/2) + n%2
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //�Է¹��� �ڿ���
		
		getBinary(n);
	}

	private static void getBinary(int a) {
		// 9
		// f(9/2)+9%2 => f(4/2)+4%2 => f(2/2)+2%2 => f(1) - 1
		//			1	<=		0	<=		  0		<=		1
		// 11
		// f(11/2)+11%2 => f(5/2)+5%2 => f(2/2)+2%2 => f(1) - 1
		//			1	 <=			1  <=		0	<=		1
		// ������ ������ ���ϰ� �Ʒ����� ���� �����ϱ� ��� ������ �Ȱ���.
		if(a==1) System.out.print("1");
		else if(a==0) System.out.print("0");
		else {
			getBinary(a/2);
			System.out.printf("%d", a%2);
		}
		
	}
}
