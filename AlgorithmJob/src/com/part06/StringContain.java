package com.part06;

import java.util.Scanner;

public class StringContain {

	// Ư�� ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� YES NO ���
	/*
	 *  1) contains() -> ��ҹ��� ���ϹǷ�, 
   		���� ���Ϸ��� str1.toLowerCase().contains(str2.toLowerCase())
				   str1.toUpperCase().contains(str3.toUpperCase())
				   
		2) indexOf() -> Ư�� ���ڿ��� �����ϸ� ù��° �ε��� ��ȯ �׷��� ���� -1��ȯ
        indexOf("dwd", ����) -> Ư�� �ε������� ���ڿ��� ã�� �ʹٸ� �� ���� �μ��� ��ġ����
        
        3)lastIndexOf() �޼���� ���ڿ��� ������ ��ġ���� Ư�� ���ڿ��� �˻�
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st01 = sc.next();
		String st02 = sc.next();
		
		if(st01.contains(st02)) System.out.println("YES");
		else System.out.println("NO");
	}
}
