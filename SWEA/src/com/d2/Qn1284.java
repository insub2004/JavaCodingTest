package com.d2;

import java.util.Scanner;

public class Qn1284 {

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int p = sc.nextInt();	//A�� 1���ʹ� p��
			int q = sc.nextInt();	//B�� �⺻��� q��
			int r = sc.nextInt();	//�⺻��� ���� ���� ��뷮 r����
			int s = sc.nextInt();	//�⺻��� �ʰ��� 1���ʹ� s���� �߰�
			int w = sc.nextInt();	//�� �ް� ���� ��뷮!!
			
			int aPrice = p*w;
			int bPrice = 0;
			if(w<=r) bPrice = q;	// B�� ���� �� �� ��뷮�� r���� ������ ��� �⺻���
			else if(w>r) bPrice = q + (w-r)*s;	//B�� ���� �� �� ��뷮�� r���� �ʰ��� 
												//�⺻��� + �ʰ��� ��ŭ*s
			System.out.printf("#%d %d\n", test_case, Math.min(aPrice, bPrice));
		}
	}
}
