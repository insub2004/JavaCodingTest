package com.part02;

import java.util.Scanner;

public class PrintBackword {

	public static void main(String[] args) {
		
		/*
		 * ������ �Է����� �޾� �Է� ���� ���� �Ųٷ� ����ϴ� �����̴�.
		 * 
		 * �Է�
		 * �Է��� ù ���� ���� ���� n �̴�. ( 1 <= n <= 1000 ) 
		 * ���� �ٿ��� n ���� ���� �Է����� �־�����. �� ���� -10000 �ʰ� 10000 �̸��� �����̴�.
		 * 
		 * ���
		 * �� �ٿ� �Է¹��� ���� �Ųٷ� ����Ѵ�.
		 * 
		 * ����� ����
		 *  8
			1 -2 3 4 6 8 2 1
			
			1 2 8 6 4 3 -2 1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=len-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
	}
}
