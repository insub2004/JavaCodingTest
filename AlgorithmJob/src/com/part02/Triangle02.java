package com.part02;

import java.util.Scanner;

public class Triangle02 {

	public static void main(String[] args) {
		//n���� �ﰢ���� ����ϴ� ���α׷��� �ۼ��Ͽ���. Input, Output�� ������ �����Ѵ�.
		//�Է�
		//ù° �ٿ� ����n�� �־�����. (0��n��100)
		//���
		//���� ������ ���� �ﰢ�� ������� ��*���� ����Ѵ�.
				
		//�Է� ��� ����
		//3
		//  *
		// **
		//***
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int z=0; z<i+1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
