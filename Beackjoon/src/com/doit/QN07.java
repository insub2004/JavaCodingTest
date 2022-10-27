package com.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QN07 {

	public static void main(String[] args) throws IOException {
		
		// ���� 1940�� �ָ�
		
		/*
		 * �ð����⵵�� ����ؼ� ������ ��������? -> n�� ������ �ִ� 15,000�̹Ƿ� ���� �˰��� �������. (�Ϲ������� ���� �˰��� �ð����⵵�� O(nlogn)
		 * �����Ͱ� unique�ϰ� ��ħ ����ϴ� �������� ������ 2���� �� ������ �Ẹ��.
		 */
		
		// �Է¹޴� ���� ������ ũ�ϱ� ���۸��� ����.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// ����� ����
		int M = Integer.parseInt(br.readLine());	// ������ ����µ� �ʿ��� ����� ��
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[N];						// ��� ��ȣ���� �迭
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);							// �迭 ����
		
		int i = 0;									// ����(min) �ε���		
		int j = N-1;								// ����(max) �ε���
		int cnt = 0;								// i+j == M �̸� ����
		
		while(i<j) {
			if(arr[i]+arr[j] < M) {
				i++;								// ���� ���� ������ min����
			}else if(arr[i]+arr[j] > M) {
				j--;								// ���� ���� ũ�� max����
			}else {
				cnt++;								// ������ cnt����, min�� max ���� �̵�
				i++;
				j--;
			}
		}
		
		System.out.println(cnt);
		br.close();
		
	}
}
