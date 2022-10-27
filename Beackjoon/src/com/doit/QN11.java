package com.doit;

import java.util.Scanner;
import java.util.Stack;

public class QN11 {

	public static void main(String[] args) {
		
		// 백준 1874번, 1부터 n까지 오름차순으로 스택에 push pop을 진행하면서 임의로 주어진 수열을 표현할 수 있는지
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 수열 갯수
		int[] A = new int[N];		// 임의의 수열 배열
		
		for(int i=0; i<N; i++) {		// 배열에 임의의 수열 넣기
			A[i] = sc.nextInt();
		}
		
		int num = 1;				// 오름차순에 사용할 변수
		boolean Result = true;		// (수열 < 오름차순의 자연수)상황에서 스택을 pop을 했는데 pop의 숫자가 수열과 같지 않으면 No를 출력  
		
		Stack<Integer> stack = new Stack<>();
		
		StringBuffer bf = new StringBuffer();	// +,-결과를 append로 버퍼에 저장해서 마지막에 출력
		
		for(int i=0; i<A.length; i++) {
			int su = A[i];			// 임의의 수열 순서대로 가져오기
			if(su >= num) {
				while(su>=num) {	// 오름차순 수가 su보다 작을경우 같을 때 까지 push해주기	
					stack.push(num++);		// push해주고 자동으로 하나 올리기 위해서 후위증감식
					bf.append("+\n");			// push 했을 때 '+' 버퍼에 추가
				}
				stack.pop();	//아직 num 5고 스택에 안들어감
				bf.append("-\n");
			}
			else {				// 현재 수열 값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄
				
				int n = stack.pop();
				if(n > su) {	// pop한 값이 su보다 크면 No
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
