package com.part07;

import java.util.Scanner;

public class IsPalindrome {

	// 팰린드롬인지 확인하는 재귀함수
	// 1) isPalindrome(char ch[], start, end) = string이 팰린드롬인지 판별
	// 2) start >= end return true 
	// 3) if([start] == [end]) return ([start+1],[end-1]) else return false
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char charr[] = str.toCharArray();
		
		if(isPalidrome(charr, 0, charr.length-1)) System.out.println("YES");
		else System.out.println("NO");
	}

	private static boolean isPalidrome(char[] charr, int i, int j) {
		System.out.printf("%d %d \n", i,j);
		if(i==j) return true;
		else if(i+1 == j) {			//가운데 알파벳이 두개 남았을 때
			if(charr[i]==charr[j]) {
				return true;		// abccba예제 여기들어오면 35들렸다가 39번으로 가는 이유는? 
			}						// 혹시 재귀라서 다시 2 3 -> 1 4-> 0 5로 돌아갔을 때 39로 가서 그때 true로 가는건가?
			else return false;
		}
		else {
			if(charr[i] == charr[j]) { 
				isPalidrome(charr, i+1, j-1);
			}
			else return false;
		}
		return true;			// 뭐지 => 아 혹시 재귀라서?
	}
	
}
