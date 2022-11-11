package com.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qn2056 {

	//	������ �޷�
	/*
	 * �ش� ��¥�� ��ȿ���� �Ǵ��� ��, ��¥�� ��ȿ�ϴٸ�

		[�׸�1] �� ���� ��YYYY/MM/DD���������� ����ϰ�,
		
		��¥�� ��ȿ���� ���� ���, -1 �� ����ϴ� ���α׷��� �ۼ��϶�.
		Ȧ���� 1~31��
		¦���� 1~30��
		2���� �׻� 28�Ϸ� �Ǵ�
		
		1) ���� 1~12 ���� �ƴ� ���
		2) ���� �ش� ���� ���� �ʴ� ���
		
		
	 */
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		
		for(int i=0; i<T; i++) {
			int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
			String str = sc.next();
			int year = Integer.parseInt(str.substring(0, 4));	// ����! subString�ؼ� parseint�ϸ� 0�� ���ڸ��� ������ ����
			//System.out.println(year);
			int month = Integer.parseInt(str.substring(4, 6));
			//System.out.println(month);
			int day = Integer.parseInt(str.substring(6));
			//System.out.println(day);
			
			
			if(month<=0 || month>12 || days[month-1] <day) System.out.printf("#%d -1 \n", i+1);
			else System.out.printf("#%d %s/%s/%s \n", i+1,str.substring(0, 4),str.substring(4, 6),str.substring(6));
		}
		
	}
	
}
