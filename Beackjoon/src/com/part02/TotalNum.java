package com.part02;

import java.util.Scanner;

public class TotalNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		
		// �ƽ�Ű�ڵ� ����'1'�� ����1�� ����(��ȭ)�� 48 or '0'
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		
		System.out.print(sum);
	}
}
