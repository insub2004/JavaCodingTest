package com.part07;

import java.util.Scanner;

public class BasicPower {

	// �ŵ������� ���ϱ⸦ ����Լ��� ���ؼ� ���غ���
	// 1) getPower(n,m)�� n^m�� ��ȯ�ϴ� �Լ�
	// 2) �������� getPower(n,0)�� 1�̴�.
	// 3) getPower(n,m)=getPower(n,m-1)*n
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(getPower(n,m));
		
	}

	private static int getPower(int n, int m) {
		// n^m�� ��ȯ�ϴ� �Լ�
		if(m==0) return 1;
		else return n*getPower(n, m-1);
	}
	
}
