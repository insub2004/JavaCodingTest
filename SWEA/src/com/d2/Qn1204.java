package com.d2;

import java.util.Scanner;

public class Qn1204 {

	// �ֺ�� ���ϱ�
	
	public static int MAX = 1000;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int t = sc.nextInt();	//test_case
			
			int[] arr = new int[MAX];
			
			for(int i=0;i<MAX;i++) {
				arr[i] = sc.nextInt();
			}
			
			// ���� ��
			int val = 0;
			// �ְ� ī��Ʈ
			int maxCnt = 0;
			// �� ����
			int cnt = 0;
			// �ֺ�
			int result = 0;
			for(int i=0;i<MAX;i++) {
				if(arr[i] == -1) continue;
				val = arr[i];
				cnt = 0;
				for(int j=0;j<MAX;j++) {
					if(arr[j]==val) {
						cnt++;
						arr[j] = -1;
					}
				}
				if(maxCnt<cnt) {
					result = val;
					maxCnt = cnt;
				}else if(maxCnt == cnt && result < val) {
					result = val;
					maxCnt = cnt;
				}
			}
			System.out.printf("#%d %d\n", t, result);
			
		}
		
	}
	
}
