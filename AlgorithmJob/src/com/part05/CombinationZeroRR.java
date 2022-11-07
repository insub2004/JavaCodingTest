package com.part05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CombinationZeroRR {

	/*
	 * ���� 1676������ ���̺���
	 * 
	 * ����
		n���� ����� m���� ������ ������� �̴� ����� ���� �����̶�� �ϸ� nCm���� ��Ÿ����.
		nCm�� �������� n!/m!(n-m)! ���� ���� �� �ִ�. (5! = 1 * 2 * 3 * 4 * 5)
		n�� m�� �־������� nCm�� ���ڸ� 0�� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  
		
		�Է�
		ù° �ٿ� ���� n, m(0��m��n��1,000,000)�� ���´�.
		
		���
		ù° �ٿ� 0�� ������ ����Ѵ�.
		
		0�� ������ �� 2��5�� �¼� �� �ּڰ��� �˾ƺ���ȴ�. 2*5->10
		
		�׸���
		2�� ����� �� 5�� ����� �� ���� 1�� ������� �ϴ� �� ��������
		
		n!=2^a1,5^a2 | n-m!=2^b1,5^b2 | m!=2^c1,5^c2
		
			n!				2^a1 X 5^a2
		(n-m)!m! =>	(2^b1 X 5^b2)X(2^c1 X 5^c2)	=> 2^(a1-b1-c1)X5^(a2-b2-c2)
						
	 */
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());
		
		long count5 = five_power(N) - five_power(N-M) - five_power(M);
		long count2 = two_power(N) - two_power(N-M) - two_power(M);
		
		System.out.println(Math.min(count5, count2));
		
	}
	
	public static long five_power(long num) {
		
		int count = 0;
		
		while(num>=5) {
			count += num/5;
			num/=5;
		}
		
		return count;
	}

	public static long two_power(long num) {
		
		int count = 0;
		
		while(num>=2) {
			count += num/2;
			num/=2;
		}
		
		return count;
	}
}
