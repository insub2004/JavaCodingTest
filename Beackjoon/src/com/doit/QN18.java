package com.doit;

import java.util.Scanner;

public class QN18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 사람 수
		
		int A[] = new int[N];	// 입력 받을 배열(인출하는데 걸리는 시간)
		
		int S[] = new int[N+1];	// 합 배열, S[0]에 0넣기 위해서 +1, S[i+1] = S[i] + A[i], S[R+1]-S[L] 구간 합
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++) {
			int insertIndex = i;		// 1부터 선택한 인덱스 값
			int insertValue = A[i];		// 선택한 인덱스 위치의 값
			
			for(int j=i-1; j>=0; j--) {	// 선택한 인덱스 왼쪽부터 0까지 비교하기 위함
				//삽입 위치 찾기
				if(A[i]>A[j]) {			// 선택했던 값보다 작은 값을 만나면, 작은 값 인덱스 한칸 오른쪽에 있는 인덱스에 삽입해야함 
					insertIndex = j+1;
					break;				// 작은 값을 만나면 더이상 탐색하지 않고 위치를 옮겨줘야함
				}
				if(j==0) {
					insertIndex = 0;	// 0까지 온거면 제일 앞까지 온 것이므로 0위치에 넣어 줘야함
				}
			}
			
			for(int j=i; j>insertIndex; j--) {		// 선택한 위치부터 삽입할 인덱스 전까지 쉬프트
				A[j] = A[j-1];
			}
			
			A[insertIndex] = insertValue;	// 삽일 할 위치에 가지고 있던 선택값 넣기
		}
		
		S[0] = 0;
		
		for(int i=0; i<S.length-1; i++) {		// 합 배열 만들기, 0부터 시작해야 함 그래야 S[1]부터 값을 넣음
			S[i+1] = S[i] + A[i];
		}
		
		int sum = 0;
		for(int i=1; i<S.length; i++) {		// 합 배열 총 합 구하기
			sum += S[i];
		}
		System.out.println(sum);
		
	}
}
