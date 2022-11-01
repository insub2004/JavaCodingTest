package com.doit;

import java.util.Scanner;

public class QN18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// ��� ��
		
		int A[] = new int[N];	// �Է� ���� �迭(�����ϴµ� �ɸ��� �ð�)
		
		int S[] = new int[N+1];	// �� �迭, S[0]�� 0�ֱ� ���ؼ� +1, S[i+1] = S[i] + A[i], S[R+1]-S[L] ���� ��
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++) {
			int insertIndex = i;		// 1���� ������ �ε��� ��
			int insertValue = A[i];		// ������ �ε��� ��ġ�� ��
			
			for(int j=i-1; j>=0; j--) {	// ������ �ε��� ���ʺ��� 0���� ���ϱ� ����
				//���� ��ġ ã��
				if(A[i]>A[j]) {			// �����ߴ� ������ ���� ���� ������, ���� �� �ε��� ��ĭ �����ʿ� �ִ� �ε����� �����ؾ��� 
					insertIndex = j+1;
					break;				// ���� ���� ������ ���̻� Ž������ �ʰ� ��ġ�� �Ű������
				}
				if(j==0) {
					insertIndex = 0;	// 0���� �°Ÿ� ���� �ձ��� �� ���̹Ƿ� 0��ġ�� �־� �����
				}
			}
			
			for(int j=i; j>insertIndex; j--) {		// ������ ��ġ���� ������ �ε��� ������ ����Ʈ
				A[j] = A[j-1];
			}
			
			A[insertIndex] = insertValue;	// ���� �� ��ġ�� ������ �ִ� ���ð� �ֱ�
		}
		
		S[0] = 0;
		
		for(int i=0; i<S.length-1; i++) {		// �� �迭 �����, 0���� �����ؾ� �� �׷��� S[1]���� ���� ����
			S[i+1] = S[i] + A[i];
		}
		
		int sum = 0;
		for(int i=1; i<S.length; i++) {		// �� �迭 �� �� ���ϱ�
			sum += S[i];
		}
		System.out.println(sum);
		
	}
}
