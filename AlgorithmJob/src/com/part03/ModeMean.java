package com.part03;

import java.util.Scanner;

public class ModeMean {

	// �ֺ�, ��� ���ϱ�
	
	/*
	 *	�Է�
		ù° �ٺ��� �� ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 1,000 ������ 10 �� ����̴�.

 

		���	
		ù° �ٿ��� ����� ����ϰ�, ��° �ٿ��� �ֺ��� ����Ѵ�. �ֺ��� �� �̻��� ��� �� �� �ּҰ��� ����Ѵ�. ��հ� �ֺ��� ��� �ڿ����̴�.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];	//�Է¹��� ������ �迭
		
		int sum = 0;					
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		int avg = sum/10;		//��հ�
		
		
		
	}
	
}
