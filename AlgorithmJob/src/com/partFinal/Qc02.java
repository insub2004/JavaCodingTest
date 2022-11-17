package com.partFinal;

import java.util.Scanner;

public class Qc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//학생수
		
		int m = sc.nextInt();	//비교횟수
		
		int edge[][] = new int[m][2];
		
		//간선 입력받기
		for(int i=0; i<m; i++) {
			edge[i][0] = sc.nextInt();
			edge[i][1] = sc.nextInt();
		}
		
		//B에 나온 횟수 배열 만들어주기
		int arr[] = new int[n+1];		
		arr[0] = -1;					//0제외
		for(int i=0; i<m;i++) {
			arr[edge[i][1]]+=1;
		}
		
		//횟수 배열을 돌면서 '0';이면 출력하고 출력되면 -1넣어주고
		//출력하는 수와 관련된 간선을 횟수 배열에서 --해주기	--> 0부터 탐색하니깐 작은 수가 먼저 나옴
		int val=0;
		for(int i=1; i<=n; i++) {				//n만큼 출력
			for(int j=1; j<arr.length; j++) {	//횟수 배열에서 0을 탐색
				if(arr[j]==0) {
					System.out.print(j+" ");	//j출력
					val = j;					//j값을 edge에서 사용해야함 
					arr[j] = -1;				//출력한 값은 -1로
					break;
				}
			}
			for(int k=0; k<m; k++) {
				if(val==edge[k][0]) {			//edge의 1열과 같은 수가 나오면 
					arr[edge[k][1]]--;			//횟수배열에서 -- 해주기
				}
			}
		}
		
	}
	
}
