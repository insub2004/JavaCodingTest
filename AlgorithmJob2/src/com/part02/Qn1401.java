package com.part02;

import java.util.Scanner;

public class Qn1401 {

	//���� �Ƕ�̵�
	//1)Ȧ�� ���� ù��° ���ڿ� �ٷ� ���� ¦�� ���� ù��° ���� ���̴� +1�̴�.
	//2)Ȧ�� ���� ��� ������ ������ ���� ��� ° ������ �������� ����
	//3)¦�� ���� ��� ���� Ȧ�� ���� ù��° ������ +1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
		}
		
	}
}
