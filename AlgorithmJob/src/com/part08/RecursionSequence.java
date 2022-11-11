package com.part08;

import java.util.Scanner;

public class RecursionSequence {

	/*
	 * N개의 알파벳 중에 R개를 나열할 수 있는 경우를 모두 출력
	 * 
	 * 3 2
	 * 
	 * ab
	 * ac
	 * ba
	 * bc
	 * ca
	 * cb
	 */

	public static int MAX = 105;
	
	
	public static Scanner sc = new Scanner(System.in);
	public static int n;	//알파벳 수
	public static int m;	//출력할 수
	public static char result[] = new char[MAX];	//결과를 담을 배열
	
	// 의미상 [a,b,c,d,---]의 배열인데 false이면 없다는것 true이면 있다고 확인하는 배열
	public static boolean check[] = new boolean[MAX];
	
	public static void main(String[] args) {
		
		//우선 문자를 표현하고 싶다 하면 char = +'알파벳'
		//    숫자를 표현하고 싶다 하면 char = +'0' 을 해주자
		/*
		char a = 0+'a';
		char b = 1+'a';
		char c = 3+'0';
		System.out.println((int)1+'a');
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
		n =	sc.nextInt();
		m = sc.nextInt();
		
		// 우선 재귀적 문제로 해결할 수 있나?
		// 3 2이면 abc를 돌면서 ab ac 이렇게 찾아야하니 for문 2개를 돌아야한다.
		// 돌아야 하는 횟수가 커지면 시간복잡도가 커지니 for문을 늘리기보단 그럼 재귀함수로 풀어보자
		
		getSequence(0);		//0을 보내주는 이유는 결과배열의 0번째에 첫 결과를 담을 for문부터 보냄 
							
		
	}

	// a번째 for문을 계속 돌려줘야 함
	private static void getSequence(int a) {
		//기저조건 적어주자
		//만약 a(result의 인덱스 = for문의 횟수)가 m(출력하려는 길이)보다 크거나 같을 때
		//result를 출력해주자
		if(a>=m) {
			for(int i=0; i<m; i++) {
				System.out.printf("%c",result[i]);
			}
			System.out.println();
		}
		//이제 재귀함수 부분생각해보자
		//먼저 for문 0부터 시작(a부터 넣기위해)해서 result배열에 해당 알파벳이 존재하지 않으면
		//지금 위치에 알파벳을 넣고 +1해서 재귀함수를 재호출
		//호출이 끝나고 나서는 result배열을 비워주기
		else {
			for(int i=0; i<n; i++) {	//n까지인 이유는 0->a 1->b 2->c 처럼 n까지 봐야하므로
				char val = (char) (i +'a');
				if(check[i]==false) {
					result[a] = val;	// 결과배열에 값 넣고
					check[i] = true;	// 체크배열에 true로 넣어주기
					
					getSequence(a+1);
					//이제 a번째에서 i를 넣는 경우를 다 고려하고 나와서
					check[i] = false;	//이래야 다시 a부터 볼 수 있다.
					result[a] = 0;
				}
			}
		}
	}
}
