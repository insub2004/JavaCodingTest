package com.doit;

import java.util.Scanner;
import java.util.Stack;

public class QN11 {

	public static void main(String[] args) {
		
		// ���� 1874��, 1���� n���� ������������ ���ÿ� push pop�� �����ϸ鼭 ���Ƿ� �־��� ������ ǥ���� �� �ִ���
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// ���� ����
		int[] A = new int[N];		// ������ ���� �迭
		
		for(int i=0; i<N; i++) {		// �迭�� ������ ���� �ֱ�
			A[i] = sc.nextInt();
		}
		
		int num = 1;				// ���������� ����� ����
		boolean Result = true;		// (���� < ���������� �ڿ���)��Ȳ���� ������ pop�� �ߴµ� pop�� ���ڰ� ������ ���� ������ No�� ���  
		
		Stack<Integer> stack = new Stack<>();
		
		StringBuffer bf = new StringBuffer();	// +,-����� append�� ���ۿ� �����ؼ� �������� ���
		
		for(int i=0; i<A.length; i++) {
			int su = A[i];			// ������ ���� ������� ��������
			if(su >= num) {
				while(su>=num) {	// �������� ���� su���� ������� ���� �� ���� push���ֱ�	
					stack.push(num++);		// push���ְ� �ڵ����� �ϳ� �ø��� ���ؼ� ����������
					bf.append("+\n");			// push ���� �� '+' ���ۿ� �߰�
				}
				stack.pop();	//���� num 5�� ���ÿ� �ȵ�
				bf.append("-\n");
			}
			else {				// ���� ���� �� < �������� �ڿ��� : pop()�� ������ ���� ���Ҹ� ����
				
				int n = stack.pop();
				if(n > su) {	// pop�� ���� su���� ũ�� No
					System.out.println("NO");
					Result = false;
					break;
				}
				else{ 
					bf.append("-\n"); 
				}
			}
			
		}
		
		if(Result) System.out.println(bf.toString());
		
	}
}
