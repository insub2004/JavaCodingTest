package com.doit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QN13 {

	public static void main(String[] args) {
		
		// 백준 2164번 카드2
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> myQ = new LinkedList<>();
		
		int N = sc.nextInt();	//카드 수
		
		for(int i = 1; i<=N; i++) {
			myQ.add(i);
		}
		
		while(myQ.size()>1) {
			myQ.poll();				// front에서부터 꺼내기
			myQ.add(myQ.poll());	// front에서 꺼내온 값 rear부분에 넣어주기
		}
		System.out.println(myQ.peek());		// myQ의 front에 있는 값 확인만 함
	}
}
