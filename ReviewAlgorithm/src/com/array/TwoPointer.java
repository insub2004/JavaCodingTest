package com.array;

import java.util.Scanner;

public class TwoPointer {

	// 백준 2018번
	
	// 15 입력
	//  i(start)
	//  1,2,3~14,15 인 배열에서
	//  j(end)
	// i와 j를 옮겨가면서 sum이 n(15)보다 작으면 end를 오른쪽으로 크면 start를 오른쪽으로 더해준다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int start_index = 1;
		int end_index = 1;
		int cnt = 0;
		int sum = 1;
		
		while(end_index<=n) {		//end_index가 n넘어가게 되면 끝 <-범위 확인
			if(sum < n) {			//sum이 n보다 작으면 더 큰수를 더해줘야 하므로
				end_index++;		//end_index를 먼저 증가시키고
				sum+=end_index;		//sum에 더해주면 end_index가 오른쪽으로 한칸 이동한 채로 sum이 만들어짐
			}
			else if(sum == n) {		//sum이 n과 같으면 
				cnt++;				//cnt를 하나 올려주고
				end_index++;		//다음 진행을 위해 end_index를 먼저 증가시키고
				sum+=end_index;		//증가시킨 end_index를 더해서 sum을 만든다
			}
			else if(sum > n){					//sum이 n보다 클 경우
				sum-=start_index;	//현재의 start_index를 먼저 빼주고
				start_index++;		//start_index를 하나 증가시켜 준다.
			}
		}
		System.out.println(cnt);
		
	}
	
}
