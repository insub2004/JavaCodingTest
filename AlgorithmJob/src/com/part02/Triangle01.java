package com.part02;

import java.util.Scanner;

public class Triangle01 {

	public static void main(String[] args) {
		
		//n���� �ﰢ���� ����ϴ� ���α׷��� �ۼ��Ͽ���. Input, Output�� ������ �����Ѵ�.
		//�Է�
		//ù° �ٿ� ����n�� �־�����. (0��n��100)
		//���
		//���� ������ ���� �ﰢ�� ������� ��*���� ����Ѵ�.
		
		//�Է� ��� ����
		//3
		//*
		//**
		//***
		
		Scanner sc = new Scanner(System.in);
		
		// n���� ���� �Է¹���
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
