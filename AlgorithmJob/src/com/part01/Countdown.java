package com.part01;
import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// N�� �־��� ��, N���� 1���� ī��Ʈ�ٿ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, N���� 1���� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է�
		// ù ��° �ٿ� ���� N�� �־�����. (1 <= N <= 100)
		// ���
		// ���� N���� 1������ �� �ٿ� �ϳ��� ����Ѵ�.
		
		// �Է� ����
		// 10
		// ��� ����
		/*
			10
			9
			8
			7
			6
			5
			4
			3
			2
			1 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=N; i>=1; i--) {
			System.out.println(i);
		}
		
		
		
		
	}

}
