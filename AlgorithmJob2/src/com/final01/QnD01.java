package com.final01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QnD01 {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int n = sc.nextInt();
			
			int s = sc.nextInt();
			
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i<n; i++) {
				list.add(sc.nextInt());
			}
			
			list.add(s);
			
			list.sort(null);
			
			//s가 들어갈 인덱스idx찾기
			int idx = 0;	//s가 들어갈 자리
			for(int i=0; i<list.size(); i++) {
				if(s==list.get(i)) idx = i;
			}
			
			if(idx==0) {	// s가 맨 앞인 경우
				System.out.printf("#%d %d",test_case,list.get(list.size()-1)-s);
				System.out.println();
			}
			else if(idx==list.size()-1) {	// s가 맨 뒤인 경우
				System.out.printf("#%d %d",test_case,s-list.get(0));
				System.out.println();
			}
			else {
				System.out.printf("#%d %d",test_case,Math.min(list.get(list.size()-1)-s, s-list.get(0))+list.get(list.size()-1)-list.get(0));
				System.out.println();
			}	
			
		}
	}
}
