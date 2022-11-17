package com.q20;

import java.util.Scanner;

public class StairNumber {

	// 43�� �ҿ�
	// �������� �迭 �ȸ���°� ���ߴ�.
	// ó�� ������ ���� �ǽ��������� �����ϰ� ���� �Ǵ� ������� ��������.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int n = sc.nextInt();	// ������ ����
			
			int arr[] = new int[n];	// ������ ���� �迭
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int ans = -1;
			for(int i=0; i<n; i++) {			// i<n ���� �� �����ϱ�
				for(int j=i+1; j<n; j++) {
					int val = arr[i]*arr[j];	// �ϳ��� ���ؼ� val�� �ְ�
					if(getResult(val) > ans) {	// getResult�Լ��� ���ļ� ������ �����
						ans = val;				// -1���� ũ�� ans�� ���(��ܼ��� ū �� ���� ��)
					}							// -1�� ������ �ᱹ -1�� ���
				}
			}
			
			System.out.printf("#%d %d\n", t,ans);
		}
		
	}

	private static int getResult(int x) {
		
		int result = -1;
		
		String str = Integer.toString(x);		//������ ���� ���ϱ� ���� ���ڷ� �ٲ��ֱ�
		char[] c = str.toCharArray();			//���ڹ迭�� �ֱ�
		int cnt = 0;							//�񱳺���
		
		for(int i=0; i<c.length-1; i++) {
			if(Character.getNumericValue(c[i]+1) == Character.getNumericValue(c[i+1])) {
				cnt++;
			}	//���� ���� ����(����)+1 �� ���� ���ڿ� ������ cnt++ : �����Ѵٰ� ����
		}
		
		if(cnt==c.length-1) result = x;		//cnt������ c����-1�̸� ��ܼ� result�� ��ܼ� ���
		return result;						//�׷��� ������ -1�� ����
	}
}
