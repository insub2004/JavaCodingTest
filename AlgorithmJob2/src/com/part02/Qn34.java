package com.part02;

import java.util.Scanner;

public class Qn34 {
	
	//���� ����ä�� �� ��й�ȣ ����...
	//���ڿ� n���� A�� B�� ����, �� B�� �� �� �� ���� 
	//������ �迭�� k��° ���ڿ��� ���� ��
	//�� ��° B��ġ�� �������� ����Ͻÿ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int cntB = 2;
		int cntA = n-2;
		
		String str = "";
		
		for(int i=0; i<cntA; i++) {
			str += "A";
		}
		
		for(int i=0; i<cntB; i++) {
			str += "B";
		}
		
		char[] arrCh = str.toCharArray();
		
		int sum = 1;
		int cnt = 2; // 1�� �Ű��� ���� �߻��ϴ� �� ������, 
		int idx = 0;
		
		while(true) {
			if(sum>=k) break;	//������ ������  k-(cnt-2) => ù B�� �Ű��� ���� ���� k
			for(int i=0; i<arrCh.length; i++) {
				if(arrCh[i]=='B') {
					idx = i;
					break;
				}
			}
			char tmp = arrCh[idx];
			arrCh[idx] = arrCh[idx-1];
			arrCh[idx-1] = tmp;

			sum += cnt++;
		}

		int rest = k - (sum-(cnt-2));	//ù ��쿡�� ���� k�� ° ���� ���� Ƚ�� 

		int result = str.length() - rest;	//�� ��° B�� ���� �ڿ��� ������ �� ĭ�� ���� ������
											//���ڿ� ���̿��� ���� Ƚ���� ���ָ� B�� �� ��° ��ġ�� ���´�.
		String ans = String.format("%04d", Integer.parseInt(Integer.toBinaryString(result)));

		System.out.println(ans);
	}
}
