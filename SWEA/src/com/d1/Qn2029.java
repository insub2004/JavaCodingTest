package com.d1;

import java.util.Scanner;

public class Qn2029 {

	// ��� ������ ����ϱ�
	// 2���� �� a, b�� �Է� �޾�, a�� b�� ���� ��� �������� ����ϴ� ���α׷��� �ۼ��϶�.
	/*
	 * �Է�
	 * 	3	<-�׽�Ʈ ���̽�
	 * 	9 2  
		15 6 
		369	15    
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//System.out.println("#"+test_case + ' ' + a/b + ' ' + a%b);
		System.out.printf("%d %d", a/b, a%b);
		
	}
}
