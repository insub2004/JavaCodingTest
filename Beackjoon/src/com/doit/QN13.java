package com.doit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QN13 {

	public static void main(String[] args) {
		
		// ���� 2164�� ī��2
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> myQ = new LinkedList<>();
		
		int N = sc.nextInt();	//ī�� ��
		
		for(int i = 1; i<=N; i++) {
			myQ.add(i);
		}
		
		while(myQ.size()>1) {
			myQ.poll();				// front�������� ������
			myQ.add(myQ.poll());	// front���� ������ �� rear�κп� �־��ֱ�
		}
		System.out.println(myQ.peek());		// myQ�� front�� �ִ� �� Ȯ�θ� ��
	}
}
