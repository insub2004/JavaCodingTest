package com.part01;
import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {

		//3 ���� ������ �־��� ��, �� �� �ִ��� ã�� ���α׷��� �ۼ��Ͽ���.
		//����
		/***
		int a,b,c;	
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int ans = 0;
		
		if(a >= b) {
			if(c >= a) {
				ans = c;
			}else {
				ans = a;
			}
		}else if(b >= c) {
			ans = b;
		}else {
			ans = c;
		}
		
		System.out.println(ans);
		***/
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a >= b && a >= c) System.out.printf("%d", a);
		else if(b>=a && b >= c) System.out.printf("%d", b);
		else System.out.printf("%d",c);
	}
}
