package com.part05;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 * 선택 정렬
		 * (오름차순 기준)
		 * 최솟값을 찾아서 정렬된 부분 바로 앞의 자리와 바꾸고 
		 * 정렬된 부분을 한칸 앞으로 보낸뒤 탐색 끝부분까지 반복한다.
		 * 
		 * 10
		 * 1 5 6 8 3 4 5 9 2 10
		 * ---
		 * 1 2 3 4 5 5 6 8 9 10
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 갯수
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;	// 최솟값을 넣을 위치 
		
		while(i<n) {
			int inx = i;						// 비교할 인덱스 변수 inx를 탐색할 범위의 첫번째 수부터 비교할 수 있게 해야한다.
			for(int k=i; k<n; k++) {			// 1) k=i부터 해야 탐색 범위를 정렬된 부분 이후부터 할 수 있다. (i왼쪽은 정렬이 다 되어있음)
				if(arr[k] < arr[inx]) {			// 2) arr[k] < arr[i]로 하면 탐색 마지막 부분에 arr[i]보다 작기만 하면 최소값으로 인지해서
					inx = k;					//    arr[k] < arr[inx]로 해야지 탐색하는 범위 중 제일 작은 값을 찾을 수 있다.
				}
			}
			int tmp = arr[i];
			arr[i] = arr[inx];
			arr[inx] = tmp;
			
			i++;
		}
		
		for(int j=0; j<n; j++) {
			System.out.printf("%d ", arr[j]);
		}
	}
}
