package com.d1;

import java.util.Scanner;

public class Qn2043Re {

	// ������ ��й�ȣ
	/*
	 * ������ ��й�ȣ�� ������ ���� �ʴ´�.

		��й�ȣ P�� 000���� 999���� ��ȣ ���� �ϳ��̴�.
		
		�־����� ��ȣ K���� 1�� �����ϸ� ��й�ȣ�� Ȯ���� �� �����̴�.
		
		���� ��� ��й�ȣ P�� 123 �̰� �־����� ��ȣ K�� 100 �� ��, 100���� 123���� 24�� Ȯ���Ͽ� ��й�ȣ�� ���� �� �ִ�.
		
		P�� K�� �־����� K���� �����Ͽ� �� �� ���� P�� ���� �� �ִ��� �˾ƺ���.
		
		==> P�� K���� ������ : k�� 1�� �����ϴٰ� �ٽ� 000���� �ö󰡾���
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int K = sc.nextInt();

		if(P>=K) System.out.printf("%d", P-K+1);
		else if(P<=K) System.out.printf("%d", (1000-K)+P);
		
	}
	
}
