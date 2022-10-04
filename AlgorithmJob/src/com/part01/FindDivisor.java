package com.part01;

import java.util.Scanner;

public class FindDivisor {

	public static void main(String[] args) {
		
		//문제
		/*
		 * 어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 6을 예로 들면

			6 ÷ 1 = 6 … 0
			6 ÷ 2 = 3 … 0
			6 ÷ 3 = 2 … 0
			6 ÷ 4 = 1 … 2
			6 ÷ 5 = 1 … 1
			6 ÷ 6 = 1 … 0
			
			그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다. 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
		 */
		
		//입력
		//첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.
		//출력
		//첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 
		//만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
		
		//입력 예제
		//6 3
		//출력 예제
		//3
		
		
		//N과 K입력 받기
		//N의 약수를 배열에 차례로 넣기
		//K번째로 작은 수를 앞에 저장했던 배열에서 찾기(없으면 0)
		
		Scanner sc = new Scanner(System.in);
		/*
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		//약수 갯수 
		int cnt=0;
		
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				cnt++;
			}
		}
		int[] intarr = new int[cnt];
		
		//배열인덱스
		int indexcnt=0;
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				//intarr[i-1] = i; --- 약수가 아닌 경우에 [i-1]차례도 건너뛰어서 i가 6일떼 [5]에 넣으려 해서 에러
				intarr[indexcnt] = i;
				indexcnt++;
			}
		}
		
		for(int i=0;i<intarr.length;i++) {
			System.out.println(intarr[i]);
		}
		
		if(intarr.length >= K) {				//>= 를 해야지 길이와 K의 값이 같은 경우에도 출력가능함
			System.out.println(intarr[K-1]);	//인덱스가 0부터니깐
		}else System.out.println(0);
		*/
		
		//굳이 K번째 이후로는 관심없다.
		//모든 약수를 구할 필요는 없는 것이다.
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int cnt = 0;
		
		//flag사용
		int flag = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				cnt++;
				
				if(cnt==k) {
					System.out.println(i);
					flag = 1;
				}
			}
		}
		if(flag==0) System.out.println(0);
		
	}
}
