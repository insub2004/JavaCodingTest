package com.part01;
import java.util.Scanner;

public class NtoMSecond {
	public static void main(String[] args) {
		//����
		//N���� M���� ����ϴ� ���α׷��� �ۼ��غ���.
		
		//�Է�
		//ù° �ٿ� �ڿ��� N�� �ڿ��� M�� ������ ������ �־�����. (N �� M �� 1,000)
		
		//���
		//ù° �ٿ� N���� M������ �ڿ����� ������ ���̿� �ΰ� ���ʴ�� ����Ѵ�.
		//(��, �� �ٿ� �ִ� 8���� ����ؾ� �Ѵ�.)
		
		//�Է� ����
		//500 512
		//��� ����
		/*
		500 501 502 503 504 505 506 507
		508 509 510 511 512
		 */
		
		//�Է¹ޱ�
		//���� �ϳ� ��� ī��Ʈ���� == 8 �̸� �ٹٲٱ�
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		
		for(int i = N; i<=M; i++) {
			if(cnt != 7) {
				System.out.print(i);
				System.out.print(" ");
				cnt++;
			}else if(cnt==7) {
				System.out.print(i);
				System.out.println();
				cnt=0;
			}
		}
		
		
	}
}
