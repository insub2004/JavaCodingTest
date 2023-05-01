package com.part02;

import java.util.Scanner;

public class Qn04 {

	public static int MAX = 100000;
	public static int[] arr = new int[MAX+1];
	
	public static void eratos(int a, int b) {
		
		//1) 2���� MAX���� �迭 ä���
		for(int i=2; i<=MAX; i++) {
			arr[i] = i;
		}
		
		//2) �ڱ��ڽ��� ������ ��� �����
		for(int i=2; i<=MAX; i++) {
			//���� ���ڰ� 0�̸� �ѱ��
			if(arr[i]==0)continue;
			//�ڱ��ڽ��� ������ ����� ����������
			//(j=i+i;MAX;j+=i(�������))
			for(int j=i+i;j<=MAX;j+=i) {
				arr[j]=0;
			}
		}
		
		//3) a���� b���� �� ü���� ��� ����ϱ�
		for(int i=a; i<=b; i++) {
			if(arr[i]==0) continue;
			else System.out.printf("%d ",i);
		}
	}
	
	//�Ҽ� �Ǻ�2
	public static void main(String[] args) {
		
		//1) 2�� 3���� �������°� �ƴϸ� �ϴ� ����غ��� (�Ұ� 2�� 3�� ����� �ȵ�)
		//2) �����佺�׳׽��� ü�� �̿��ؼ� Ǯ���
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		eratos(n,m);
	}
}
