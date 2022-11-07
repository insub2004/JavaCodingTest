package com.part05;

import java.util.Scanner;

public class FractionSum {

	//	���� 1735��
	// 	1) ���� �м��� ���� ���ϰ�
	//  2) ��Ŭ���� ȣ�������� GCD�� ���ϰ� �и�,���ڸ� ���� ������ ���м��� ������.
	
	public static int FindGCD(int a, int b) {
		
		int r = 0;
		int result = 0;
		
		while(true) {
			r = a%b;
			if(r==0) {
				result = b;
				break;
			}
			a = b;
			b = r;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ja01 = sc.nextInt();	//���� 2�� �и� 2�� �Է�
		int mo01 = sc.nextInt();	
		int ja02 = sc.nextInt();
		int mo02 = sc.nextInt();
		
		int num01 = (ja01*mo02)+(ja02*mo01);	// �м��� �� ���ںκ� (a*�и�2)+(b*�и�1)
		int num02 = mo01*mo02;					// �м��� �� �и�κ�	 �и�1 * �и�2
		
		//GCD���ϱ�
		int GCD = FindGCD(num01,num02);
		
		//���м��� �����
		System.out.print(num01/GCD + " ");
		System.out.println(num02/GCD);
	}
	
}
