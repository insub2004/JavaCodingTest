package com.part08;

import java.util.Scanner;

public class AlphaSequence02 {

	/*
	 * 서로 다른 n개의 원소들 중에서 r개만을 뽑아 일렬로 나열하는 것을 순열이라 한다. 
	 * 예를 들어, 3개의 원소 a, b, c 중에서 2개만을 뽑아 나열하면 ab, ac, ba, bc, ca, cb 의 6가지 경우가 있다. 
	 * n과 r이 주어질 때, n개의 소문자 중에서 r개만을 뽑아 나열하는 모든 경우를 출력하는 프로그램을 작성하시오. 
	 * 단, a부터 시작하여 연속으로 n개의 알파벳을 갖고 있다고 하자.  

		입력
		첫 번째 줄에 n과 r이 주어진다. ( 1 ≤ n ≤ 10, 0 ≤ r ≤ min(n, 7) )  
		
		출력
		각 줄에 n개의 소문자 중에서 r개만을 뽑아 나열하는 경우를 사전순으로 나열한 결과를 출력한다.
		
		다른 풀이로 최대한 안보고 풀어보자.(check[]안쓰고)
	 */
	
	//다른 함수에서도 참고하는 변수는 전역변수로 만들 것
	
	public static int n;
	public static int r;
	public static int[] result = new int[26];
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		r = sc.nextInt();
		
		getResult(0);		//result의 0번째부터 채워나가기 때문에 0을 넘겨준다.
							//0번째 for문
		
	}

	private static void getResult(int x) {
		// r중 for문을 도는 함수
		
		boolean flag = false;
		// 우선 기저조건 일 때
		if(x>=r) {			//for문의 수가 출력할 수보다 같아진거면 i만큼 다 돌은 것
			//근데 만약 aaa같이 중복된 경우가 result이면 출력 안해주기 위해서 flag변수 사용
			for(int i=0; i<r; i++) {	//중복일 경우 이중for문을 이용하자.
				for(int j=0; j<r; j++) {
					if(i!=j && result[i] == result[j]) flag = true;
					// 자리가 다르면서 배열값이 같으면 중복이라는 뜻
				}
			}
			if(flag==false) { //현재 출력할 값이 중복되지 않았다는 뜻
				for(int i=0; i<r; i++) {
					System.out.printf("%c", result[i]+'a');
				}
				System.out.println();
			}
		}
		else {
			for(int i=0; i<n; i++) {
				result[x] = i;
				getResult(x+1);
			}
		}
		
	}
}
