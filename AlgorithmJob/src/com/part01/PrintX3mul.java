package com.part01;

import java.util.Scanner;

public class PrintX3mul {

	public static void main(String[] args) {
		
		//1���� N������ ���ڸ� ����Ѵ�. ��, 3�� ��������� ���� X�� ����Ѵ�.
		
		//�Է� ����
		//10
		//��� ����
		//1 2 X 4 5 X 7 8 X 10
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//1���� ����ϴ� for������ i���� ���
		//3�� ����̸� X�� �ƴϸ� i�� �������
		
		for(int i=1; i<=n; i++) {
			if(i%3==0) {
				System.out.print("X");
			}else System.out.print(i);
			System.out.print(" ");
		}
		
	}
}
