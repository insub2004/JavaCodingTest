package com.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qn2047Re {

	// �Ź� ������
	
	public static void main(String[] args) throws IOException {
		
		//�� ����
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		
		/*
		System.out.println(st.toUpperCase());
		*/
		
		//isLowerCase �� ���for���̿� ��
		String answer = "";
		for(char x:st.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer += x;
		}
		System.out.println(answer);
		
	}
}
