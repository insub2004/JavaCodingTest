package com.part01;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 - 9 ������ �ڿ����� �Է¹ް�, �׿� �´� �������� ����ϴ� ���α׷��� �ۼ��غ���.
		//�Է� - ù° �ٿ� �ڿ���N�� �Էµȴ�. ( 1 <= N <= 9 )
		//��� - N�� �ش��ϴ� �������� ����Ѵ�. (��, ���ڿ� ���� ���̿� ������ ����.)
		
		//���� �Է� 
		//5
		
		//���� ���
		/*
		 * 	5*1=5
			5*2=10
			5*3=15
			5*4=20
			5*5=25
			5*6=30
			5*7=35
			5*8=40
			5*9=45
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",N,i,N*i);
		}
		
	}

}
