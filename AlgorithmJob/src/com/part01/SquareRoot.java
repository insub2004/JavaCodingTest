package com.part01;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		//����
		/*
		 * N�� �־��� ��, �����Ͽ� N���� ũ�ų� ���� ���ڵ� �� �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		���� ���, N = 10 �̶�� ����. �׷��� s=3 �� ��� 3 x 3 = 9 �̹Ƿ� 10���� ũ�ų� ���� �ʴ�. 
		s=4�� ���, 4 x 4 = 16 �̹Ƿ� 10���� ũ�ų� ����. s=5�� ���, 5 x 5 = 25 �̹Ƿ� 10���� ũ�ų� ����.
		��, s = 4, 5, 6, ..., �� ���ڵ��� ��� �����ϸ� 10���� ũ�ų� ����. �� �� �ּڰ��� 4�̹Ƿ�, 4�� ����Ѵ�.
		 */
		
		//�Է�
		//ù ��° �ٿ� N�� �־�����. (1 <= N <= 10000)
		
		//���
		//�����Ͽ� N���� ũ�ų� ���� ���ڵ� �� �ּڰ��� ����Ѵ�.
		
		//�Է¿���
		//100
		//��¿���
		//10
		
		//�Է¹ޱ�

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 1���� �����ؼ� ������ ���� N���� ���� ���� ans
		int ans = 0;
		while(ans*ans<N) {
			ans++;
		}
		System.out.println(ans);

	}
}