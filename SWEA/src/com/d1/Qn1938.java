package com.d1;

import java.util.Scanner;

public class Qn1938 {

	// �� ���� �ڿ����� �Է¹޾� ��Ģ������ �����ϴ� ���α׷��� �ۼ��϶�.
	/*
	 * [���� ����]

		1. �� ���� �ڿ��� a, b�� 1���� 9������ �ڿ����̴�. (1 �� a, b �� 9)
		
		2. ��Ģ���� + , - , * , / ������ ������ ����� ����Ѵ�.
		
		3. ������ ������ ������� �Ҽ��� ������ ���ڴ� ������.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
	}
}
