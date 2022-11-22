package com.partq20;

import java.util.Arrays;
import java.util.Scanner;

public class isPrimHasK {

	// 28�� 48�� �ҿ�
	
	public static boolean arr[] = new boolean[1000010];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		Arrays.fill(arr, true);		//�� �Ҽ���� ����
		
		arr[1] = false;
		
		for(long i=1; i<=1000000; i++) {
			if(!arr[(int)i]) continue;		//�������� �ѱ��
			
			for(long j=i*i; j<=1000000; j+=i) {
				arr[(int)j] = false;		//����� �����
			}
		}
		
		for(int t=1; t<=T; t++) {
			
			int v = sc.nextInt();
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			int cnt = 0;
			
			for(int i=s; i<=e; i++) {
				boolean flag = false;
				
				if(arr[i]==true) {
					flag = isContainV(v, i);
				}
				
				if(flag== true) cnt++;
			}
			
			System.out.printf("#%d %d\n", t,cnt);
			
		}
		
		
	}

	private static boolean isContainV(int v, int i) {
		
		int n = i;
		boolean flag = false;
		
		while(n>0) {
			if(n%10==v) {
				flag = true;
				break;
			}
			n/=10;
		}
		
		return flag;
	}
	
}
