package com.part06;

import java.util.Scanner;

public class ReverseString {

	// ���ڸ� �Ųٷ� ������
	// 1) for�� �̿�
	// 2) StringBuffer�� reverse()���
	/*
	 * StringBuffer sb = new StringBuffer(str);
		StringBuffer Ŭ������ String�� �ٷ�� Ŭ�����Դϴ�.
		�������� �Ķ���ͷ� ���ڿ��� �Է¹��� �� �ֽ��ϴ�.
		
		String reverse = sb.reverse().toString();
		StringBuffer Ŭ������ reverse() �޼ҵ带 ȣ���ϸ�,
		reverse() �޼ҵ带 ȣ���� ��ü, �� ���⼭�� sb�� ���ڿ��� �Ųٷ� �����
		sb ��ü�� reference�� �����մϴ�.
		(reverse() �޼ҵ�� StringBuffer ��ü�� �����ϱ� ������, 
		toString() �޼ҵ带 ����Ͽ� String���� ��ȯ�� �־����ϴ�.)
		����, ��� ����� ����,
		sb ��ü�� ���ڿ��� ������ �ְ�,
		reverse() �޼ҵ尡 ������ reverse�� ���ڿ��� ������ �ִ� ���� Ȯ�� �� �� �ֽ��ϴ�.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		/*
		for(int i=st.length()-1; i>=0; i--) {
			System.out.print(st.charAt(i));
		}
		*/
		StringBuffer sb = new StringBuffer(st);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
	}
	
}
