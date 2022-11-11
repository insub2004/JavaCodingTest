package com.part07;

import java.util.Scanner;

public class IsPalindrome {

	// �Ӹ�������� Ȯ���ϴ� ����Լ�
	// 1) isPalindrome(char ch[], start, end) = string�� �Ӹ�������� �Ǻ�
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
		else if(i+1 == j) {			//��� ���ĺ��� �ΰ� ������ ��
			if(charr[i]==charr[j]) {
				return true;		// abccba���� ��������� 35��ȴٰ� 39������ ���� ������? 
			}						// Ȥ�� ��Ͷ� �ٽ� 2 3 -> 1 4-> 0 5�� ���ư��� �� 39�� ���� �׶� true�� ���°ǰ�?
			else return false;
		}
		else {
			if(charr[i] == charr[j]) { 
				isPalidrome(charr, i+1, j-1);
			}
			else return false;
		}
		return true;			// ���� => �� Ȥ�� ��Ͷ�?
	}
	
}
