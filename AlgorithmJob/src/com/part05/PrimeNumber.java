package com.part05;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// �Ҽ� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean flag = false;
		// flag�� false�� �Ҽ���
		// flag�� true�� �Ҽ��� �ƴ�
		
		for(int i=2; i<n; i++) {
			if(n%i==0) flag=true;
		}
		
		if(flag==true) System.out.println("�Ҽ��� �ƴմϴ�!");
		else System.out.println("�Ҽ��Դϴ�!");
		
		
		
	}
}
