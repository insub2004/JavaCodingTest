package com.partq20;

import java.util.Scanner;

public class ThreeNumSum {

	// ���� ���� ������.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int n = sc.nextInt();
			
			boolean is_prime[] = new boolean[1010];
			
			for(int i=1; i<=n; i++) {
				is_prime[i] = true;
			}
			is_prime[1] = false;
			
			for(int i=1; i<=n; i++) {
				if(!is_prime[i]) continue;	//false�� �������ٰ� �Ǵ�
				
				for(int j=i*i; j<=n; j+=i) {
					is_prime[j] = false;
				}
			}
			int arr[] = new int[n];
			
			for(int i=0; i<=n;i++) {
				for(int j=1; j<=n; j++) {
					if(is_prime[j]==true) {
						arr[i] = j;
						is_prime[j] = false;
						break;
					}
				}
			}
			
			int len = 0;	// �Ҽ��迭���� ���� �����ϴ� �� ������ ����
			int cnt = 0;
			
			for(int i=0; arr[i]!=0; i++) {
				len++;
			}
			
			for(int i=0; i<len; i++) {
				for(int j=i; j<len; j++) {
					for(int k=j; k<len; k++) {
						if(arr[i] + arr[j] + arr[k] == n) {
							cnt++;
						}
					}
				}
			}
			
			/*  3���� ���� ���� �ȵȴٰ� �����ϰ� Ǭ ��...
			// 2�� ���� ���� ���
			for(int i=0; i<len-1; i++) {
				if(arr[i]*2>=n) break; 
				for(int j=i+1; j<len; j++) {
					if(arr[i]*2 + arr[j]==n) {cnt++;
					System.out.printf("%d %d %d\n", i, i, j);};
				}
			}
			
			// 1 1 1�� �� ��
			for(int i=0; i<len-2; i++) {
				for(int j=i+1; j<len-1; j++) {
					for(int k=j+1; k<len; k++) {
						if(arr[i]+arr[j]+arr[k]==n) {cnt++;	//���� ���� ������ +
						System.out.printf("%d %d %d\n", i, j, k);}
					}
				}
			}
			*/
			System.out.printf("#%d %d\n", t,cnt);
			
		}
		
	}
	
}
