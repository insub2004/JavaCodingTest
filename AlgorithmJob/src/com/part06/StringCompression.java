package com.part06;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String res = "";
		
		char[]arr = str.toCharArray();
		
		char []p = new char[1];			// ���� �� ����� char[]����
		int cnt = 1;					// ������ 1�� ���� ����
		p[0] = arr[0];				    // ���� ���� �տ� �ִ� ���� �ϳ� ����ְ� ����
		
		
		for(int i=1; i<arr.length; i++) {				// 1���� ������ Ž��
			if(p[0] == arr[i]) cnt++;					// �񱳹��ڿ� ������ cnt++
			else if(p[0] != arr[i] && cnt == 1) {		// �񱳹��ڿ� ���� �����鼭 cnt�� 1�̸� => ���� �ϳ��� ������		
				res += String.valueOf(p[0]);			// cnt�� �����ϰ� ��� ���ڿ��� ���ڸ� ��� 
				p[0] = arr[i];							// �� ���� �ٲ��ְ�
				cnt = 1;								// �����Ŀ� ���� ������ �ϳ� �ڿ������� ���ϴ� 1���� ����
			}else {										// �񱳹��ڿ� ���� ������ ��� ���ڿ��� cnt�� �񱳹��� ���� ���� �����ؼ� �ֱ�
				res += String.valueOf(cnt) + String.valueOf(p[0]);
				p[0] = arr[i];							// �ְ� �񱳹��� ����
				cnt = 1;								// �����Ŀ� ���� ������ �ϳ� �ڿ������� ���ϴ� 1���� ����
			}
		}
		if(cnt != 1) res += String.valueOf(cnt) + String.valueOf(p[0]);	// ������ ������ �ִ� �� ����ֱ�
		else res += String.valueOf(p[0]);
		
		System.out.println(res);
		
	}
}
