package com.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QN07 {

	public static void main(String[] args) throws IOException {
		
		// 백준 1940번 주몽
		
		/*
		 * 시간복잡도를 고려해서 정렬이 가능한지? -> n의 갯수가 최대 15,000이므로 정렬 알고리즘 사용하자. (일반적으로 정렬 알고리즘 시간복잡도는 O(nlogn)
		 * 데이터가 unique하고 마침 사용하는 데이터의 갯수가 2개니 투 포인터 써보자.
		 */
		
		// 입력받는 값의 범위가 크니깐 버퍼리더 쓰자.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// 재료의 갯수
		int M = Integer.parseInt(br.readLine());	// 갑옷을 만드는데 필요한 재료의 합
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[N];						// 재료 번호들의 배열
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);							// 배열 정렬
		
		int i = 0;									// 앞쪽(min) 인덱스		
		int j = N-1;								// 뒤쪽(max) 인덱스
		int cnt = 0;								// i+j == M 이면 증가
		
		while(i<j) {
			if(arr[i]+arr[j] < M) {
				i++;								// 더한 값이 작으면 min증가
			}else if(arr[i]+arr[j] > M) {
				j--;								// 더한 값이 크면 max감소
			}else {
				cnt++;								// 같으면 cnt증가, min과 max 각각 이동
				i++;
				j--;
			}
		}
		
		System.out.println(cnt);
		br.close();
		
	}
}
