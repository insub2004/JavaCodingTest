package com.part06;

import java.util.Scanner;

public class Strlen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//char data = sc.next().charAt(0);
		//System.out.println(data);
		
		char datas[] = new char[100];
		datas = sc.next().toCharArray();
		//System.out.println(datas.length);		//hello �Է½� 5

		
		String str = "World";
		String strarr[] = str.split("");		//�ѱ��ھ� �߶� �ֱ�
		for(int i=0; i<strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
		char chararr[] = str.toCharArray();		//toCharArray�� �̿��ؼ� ���ڿ��� char�迭�� �� ���ھ� ����
		for(int i=0; i<strarr.length; i++) {
			System.out.println(chararr[i]);
		}
	}
}
