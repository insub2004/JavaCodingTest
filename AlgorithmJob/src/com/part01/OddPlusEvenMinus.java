package com.part01;

import java.util.Scanner;

public class OddPlusEvenMinus {

	public static void main(String[] args) {
		
		
		/*
		 * �� ���� �ڿ��� A, B�� �־�����. 
		 * ���� A���� B���� ��� ���ڿ� ���Ͽ� Ȧ���� ���ϰ� ¦���� �� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ��, A <= B��� �����Ѵ�.
		 * �Է�
		 * ù ��° �ٿ� A, B�� �־�����. (1 <= A <= B <= 1000)
		 * ���
		 * A���� B���� ��� ���ڿ� ���Ͽ� Ȧ���� ���ϰ� ¦���� �� ����� ����Ѵ�.
		 */
		//�Է� ��� ����
		//3 8
		//-3
		
		//4 4
		//-4
		
		Scanner sc = new Scanner(System.in);
		
		//�� �Է¹ޱ�
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//������ �� ��� ���
		int flag = 0;
		
		//Ȧ���� Ȧ������ ¦���� ¦������
		int odd = 0;
		int even = 0;

		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
			flag=1;
		}
		
		/*
		if(flag==1) {
			System.out.println(odd-even);
		}else {
			if(a==b && a%2==0) {		//¦���� ���
				System.out.println(-a);
			}else if(a==1 && b==1){
				System.out.println(1);
			}else {
				System.out.println(a);
			}
		}
		*/
		// a,b�� ���� ��쿡 �ݺ����� 1ȸ �����ؼ� ������ ����!!!!!!
		System.out.println(odd-even);
	}
}
