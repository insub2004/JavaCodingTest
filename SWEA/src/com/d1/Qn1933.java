package com.d1;

import java.util.Scanner;

public class Qn1933 {

	// ������ N�� ���
	// �Է����� 1���� ���� N �� �־�����.
	// ���� N �� ����� ������������ ����ϴ� ���α׷��� �ۼ��϶�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0)System.out.printf("%d ", i);
		}
		
	}
	
}
