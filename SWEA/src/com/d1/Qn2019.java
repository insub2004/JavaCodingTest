package com.d1;

import java.util.Scanner;

public class Qn2019 {

	//�������
	//1���� �־��� Ƚ������ 2�� ���� ��(��)�� ����Ͻÿ�.
	//�־��� ���ڴ� 30�� ���� �ʴ´�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mul = 1;
		for(int i=n;i>=0;i--) {
			System.out.printf("%d ",mul);
			mul=mul*2;
		}
		
	}
}
