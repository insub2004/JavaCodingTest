package com.d1;

import java.util.Scanner;

public class Qn2058Re {

	/*
	 *�ϳ��� �ڿ����� �Է� �޾� �� �ڸ����� ���� ����ϴ� ���α׷��� �ۼ��϶�.
		[���� ����]
		�ڿ��� N�� 1���� 9999������ �ڿ����̴�. (1 �� N �� 9999)
		
		[�Է�]
		�Է����� �ڿ��� N�� �־�����.
		
		[���]
		�� �ڸ����� ���� ����Ѵ�. 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*//���þ Ǯ�̴�.
	    String string=sc.nextLine();
        int total=0;
        for(int i=0; i<string.length(); i++) {
            total+=string.charAt(i)-'0';			//����1�� ����1�� �ٲٰ� ������ ����1�� �ƽ�Ű�ڵ尪 49�̹Ƿ� '0'�� �ƽ�Ű�ڵ�48
        }											//����i - '0'or48 �ϸ� ���ڰ� ����
        System.out.println(total);
		*/
		
		int val = sc.nextInt();
		int sum = 0;
		while(val>0) {
			sum += val%10;
			val=val/10;
		}
		System.out.println(sum);
	}
	
}
