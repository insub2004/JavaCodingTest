package com.part02;

import java.util.Scanner;

public class Qn15 {

	//array3
	//1) ���� ���������� ������ �� ���� sum+=1�� ����
	//2) �ٹٲ� �� ���� sum+=i�� �����ϸ鼭 �ش� ���� ù ���� ������ sum�̱⵵��.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int start = 0;
		int idx = 0;
		
		for(int i=1; i<=n; i++) {
			start += i;	//���� ������
			sum = start;
			idx = i;	//���� ������
			for(int j=1; j<=n+1-i; j++) {
				System.out.print(sum+" ");
				sum+=idx++;
			}
			System.out.println();
		}
	}
}
