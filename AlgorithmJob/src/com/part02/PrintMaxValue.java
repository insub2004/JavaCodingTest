package com.part02;

import java.util.Scanner;

public class PrintMaxValue {

	public static void main(String[] args) {
		
		/*
		 * ���� �ٸ� �ڿ��� �� ���� �Է¹ް� �ִ��� ã�� ���α׷��� �ۼ��غ��� ��.  
		 * 
		 * �Է�
		 * �� ���� �ڿ����� �־����ϴ�.
		 * 
		 * ���
		 * �ִ��� ã�� ���ÿ� ���� ����մϴ�.
		 * 
		 * ����¿���
		 * 3 4 5
		 * �ִ��� 5�Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxVal = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		
		System.out.printf("�ִ��� %d�Դϴ�", maxVal);
	}
}
