package com.part02;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		/*
		 * ���ڸ� �Է� �޾� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է�
		 * ù ��° �ٿ� ���ڸ� �Է� �޴´�. ������ ũ��� 1,000���� �۰ų� ����
		 * 
		 * ���
		 * ù° �ٿ� ���ڸ� �������� �ٲپ� ����Ѵ�.
		 *
		 * ����� ����
		 * 14
		 * 1110
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.print(Integer.toBinaryString(x));
		
		
	}
}
