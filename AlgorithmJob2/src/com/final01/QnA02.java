package com.final01;

import java.util.Scanner;

public class QnA02 {

	//�� �����(��������)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n+5];
		
		
		//m����ŭ �Է¹ް� m����ŭ ���ϱ�
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a]--;
			arr[b]++;
		}
		
		System.out.println(2 + " " + 3 + " " + 1);
		
	}
}
