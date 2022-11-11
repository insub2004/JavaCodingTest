package com.part08;

import java.util.Scanner;

public class AlphaSequence {

	/*
	 * 서로 다른 n개의 원소들 중에서 r개만을 뽑아 일렬로 나열하는 것을 순열이라 한다. 
	 * 예를 들어, 3개의 원소 a, b, c 중에서 2개만을 뽑아 나열하면 ab, ac, ba, bc, ca, cb 의 6가지 경우가 있다. 
	 * n과 r이 주어질 때, n개의 소문자 중에서 r개만을 뽑아 나열하는 모든 경우를 출력하는 프로그램을 작성하시오. 
	 * 단, a부터 시작하여 연속으로 n개의 알파벳을 갖고 있다고 하자.  

		입력
		첫 번째 줄에 n과 r이 주어진다. ( 1 ≤ n ≤ 10, 0 ≤ r ≤ min(n, 7) )  
		
		출력
		각 줄에 n개의 소문자 중에서 r개만을 뽑아 나열하는 경우를 사전순으로 나열한 결과를 출력한다.
	 */
	
	public static int MAX = 105;
	public static int n;	//알파벳 수
	public static int r;	//나열할 갯수

	public static char result[] = new char[105];
	public static boolean check[] = new boolean[105];
	
	public static void main(String[] args) {
		
		// 우선 r이 2이상 넘어가면 for문이 너무 많이 쓰인다.
		// 재귀적으로 접근해서 풀어보자.
		// 알파벳은 i-'a'와 같이 i가 0부터 증가하면서 나타내면 되고
		// 결과를 출력할 char배열과 boolean형의 check배열[0,1,2....] 의미상[a,b,c...]
		// 재귀함수는 x번 만큼 for문을 돈다
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 2개 받고
		n = sc.nextInt();
		r = sc.nextInt();
		
		// 0번째 for문부터 돌아야함으로 0을 넘겨준다.
		getSequence(0);
	}

	private static void getSequence(int x) {
		if(x>=r) {		// 만약 x가 출력하려는 갯수보다 크거나 같아지면(for문의 갯수) 지금까지 결과를 출력해버린다.
			for(int i=0; i<r; i++) {
				System.out.printf("%c",result[i]);
			}
			System.out.println();
		}
		else {			// check를 해서 check[x]번째가 true인지 false인지 확인해서 
						// false면 result에 넣어주고 (x+1)넘어가고
						// true면 check[x]다음으로 넘기기
			for(int i=0; i<n;i++) {
				char val = (char) (i+'a');
				if(check[i]==false) {
					result[x] = val;		//result에 값을 넣을 때는 x로 넣어줘야함!!!!
					check[i]=true;		
					
					getSequence(x+1);
					//갔다오면 false로 만들어주고
					check[i] = false;
					result[x] = 0;			//뺄때도 x로 빼줘야함!!!!
				}
			}
		}
	}
	
}
