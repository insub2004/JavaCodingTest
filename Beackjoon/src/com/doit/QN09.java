package com.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QN09 {

	static int myArr[];
	static int checkArr[];
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		
		// ���� 12891�� DNA ��й�ȣ
		
		/*
		 * 	
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//���ڿ��� ���̿�, �κй��ڿ��� ����
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		//��ü ���ڿ� �ް� ����
		char A[] = new char[S];
		A = bf.readLine().toCharArray();	//�̰� �ͼ�������
		
		// ������¹迭, ����񱳹迭, �����񱳺���, ����Ҵ亯��
		myArr = new int[4];
		checkArr = new int[4];
		checkSecret = 0;
		int Result = 0;
		
		//����񱳹迭�� ���䰹�� �ֱ� { A, C, G, T }
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			//�ٵ� 0�̸� P�� ���� ��� �����̱� ������ 0�� ������ ++������
			if(checkArr[i] == 0) checkSecret++;
		}
		
		for(int i=0; i<P; i++) {
			add(A[i]);
		}
		
		// ù ���� result�� �÷��ֱ�
		if(checkSecret == 4) Result++;
		
		// ������ �κ� �����̽� ������ ó���ϱ�
		for(int i=P; i<S; i++) {
			int j = i-P;
			add(A[i]);		// �޺κ� �־��ֱ�	+	�ʹ� �迭�� ���� ���� ó���Ϸ��� ������������
			remove(A[j]);	// �պκ� �־��ֱ�
			if(checkSecret == 4) Result++;
		}
		
		System.out.println(Result);
		bf.close();
		
		
	}

	private static void remove(char c) {
		switch (c) {
		case 'A':
			if(myArr[0] == checkArr[0]) checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if(myArr[1] == checkArr[1]) checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2] == checkArr[2]) checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if(myArr[3] == checkArr[3]) checkSecret--;
			myArr[3]--;
			break;
		}
	}

	private static void add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if(myArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if(myArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if(myArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if(myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
	}
}
