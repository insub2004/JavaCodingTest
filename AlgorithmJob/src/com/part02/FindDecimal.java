package com.part02;

import java.util.Scanner;

public class FindDecimal {

	public static void main(String[] args) {
		/*
		 * �ڿ���n,m�� �־��� ��, n����m���� �����ϴ� �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͽ���. 
		 * ���⼭ �Ҽ���, ����� 1�� �ڱ��ڽŹۿ� �������� �ʴ� ���� ���Ѵ�.
		 */
		
		//����� ����
		//13 30
		//13 17 19 23 29
		
		//�� �� �Է¹ް�
		//for������ ��� �Ǻ��ؼ� i��� �ƴϸ� _���
		
		 Scanner sc = new Scanner(System.in);
		 
		 int min = sc.nextInt();
		 int max = sc.nextInt();
		 
		 int cnt = 0;
		 
		 for(int i=min; i<=max; i++) {
			 for(int j=2; j<=i-1; j++) {
				 if(i%j==0) cnt++;
			 }
			 if(cnt!=0) cnt=0;
			 else if(i==1) continue;	//min���� 1�� ��� ���ܽ�Ű��
			 else {
				 
				 cnt = 0;
				 System.out.print(i);
				 System.out.print(" ");
			 }
		 }
	}
}
