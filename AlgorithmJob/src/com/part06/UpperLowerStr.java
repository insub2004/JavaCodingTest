package com.part06;

import java.util.Scanner;

public class UpperLowerStr {

	// �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ
	// ���ĺ��� �ƴ� ���ڴ� �ѱ��.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();			//���Ⱑ �ִ� ������ nextLine()���� �Է¹ޱ�!!!!
		
		char arr[] = str.toCharArray();
		
		//System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			if(Character.isUpperCase(arr[i])) arr[i] = Character.toLowerCase(arr[i]);
			else if(Character.isLowerCase(arr[i])) arr[i] = Character.toUpperCase(arr[i]);
			else continue;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
}
