package com.partq20;

import java.util.Scanner;

public class StringDecode {

	// 26�� �ɸ�
	// char �迭 �ʱ�ȭ�� ����Ʈ ���� '\0'�� �� �������
	// char'����'-'0'�� int�� ��ȯ�ȴ�.
	// Character.getNumericValue() �̰� �ֳ�???;;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String st = sc.next();				// ���ڿ� �Է� �ޱ�
			char[] arr = new char[2010];		// st ���ڿ��� �ϳ��� char�� �ɰ��� ���� �迭
			String ans = "";					// ���信 �� ���ڿ� ����
			
			for(int i=0; i<st.length(); i++) {
				arr[i] = st.charAt(i);			// char arr[] �迭�� ���
			}

			for(int i=0; arr[i]!='\0'; i++) {
				int val = arr[i] - '0';			// ���� char'����'���� '0'�� ���� 1~9���̰� ���´�
				if(val>=1 && val<=9) {			// 1~9���̸�
					for(int j=1; j<val; j++) {	
						ans += arr[i+1];		// ���ڸ�ŭ ans�� ���ڵڿ� �ִ� ���ڿ��� ����ֱ�
					}
				}else {
					ans += arr[i];				// ���࿡ 1~9�� �ƴϸ� ���ڰ� �ƴϹǷ� �ش� ���ڸ�
				}								// �׳� �ϳ� ans�� ����ֱ�
			}
			System.out.printf("#%d %s\n", t, ans);	//���
		}
	}
}
