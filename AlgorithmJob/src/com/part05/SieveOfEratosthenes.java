package com.part05;

public class SieveOfEratosthenes {

	// �����佺�׳׽��� ü
	// 2���� �ڱ��ڽ��� �����ϰ� �ڽ��� ������� ����� ���� �����ִ� ���� �Ȱ��� �ڱ��ڽ��� �����ϰ� ����� ����� ���� �ݺ�
	
	public static int MAX = 100000;
	public static int a[]=new int[MAX+1];
	
	public static void primeNumberSieve(){
		
		for(int i=2; i<=MAX; i++) {			// ��ü�� ���� �Է�
			a[i] = i;
		}
		
		for(int i=2; i<=MAX; i++) {
			if(a[i]==0)continue;				// ���� ���� ���ڰ� 0�̸� �Ѿ�� => i(�ڱ��ڽ� ����)�� ������� 0��
			for(int j=i+i; j<=MAX; j += i) {	// for(�ڽ��� �����ϰ� ���� ������� ����; ������MAX������; ���� ��� ���ڷ� �̵�)
				a[j] = 0;						// i:2�ϰ�� (4����;������;����6����)
			}			
		}
		
		for(int i=2; i<=MAX; i++) {
			if(a[i]!=0)System.out.printf("%d ", a[i]);
			if(i%100==0) System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		primeNumberSieve();
		
	}
	
}
