package com.part05;

import java.util.Scanner;

public class PROSJECK {

	/*
	 * �ΰ��̴� ���� �����ð����� ��մ� ������� ������ �����ϰ� �ִ�.

		���� �ΰ��̴� ���� ���� A�� �ۼ��ߴ�.
		
		�׸��� ���� �� �Ʒ��� A�� �ش� �ױ����� ��հ��� �� ������ �ϴ� ���� ���� B�� ����.
		
		���� ��� , ���� ���� A�� 1, 3, 2, 6, 8 �̶�� ���� B�� 1/1, (1+3)/2 , (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5 ��, 1, 2, 2, 3, 4 �� �ȴ�.
		
		���� B�� �־����� �� ���� A�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arrB[] = new int[n+1];		//���� B
		
		for(int i=1; i<n+1; i++) {
			arrB[i] = sc.nextInt();
		}
		
		
		int arrA[] = new int[n+1];		//���� A
		int sum = 0;
		for(int i=1; i<n+1; i++) {
			if(i==1) {
				arrA[i] = arrB[1];
				sum+=arrA[i];			//A[1]��°�� ���� �־��ְ� sum���� ������� �ڿ� ���� sum�� �� �� ������ �ش�.
				continue;
			}
			arrA[i] = arrB[i]*i - sum;
			sum+=arrA[i];
		}
		
		for(int i=1; i<n+1; i++) {
			System.out.print(arrA[i] + " ");
		}
		
	}
}
