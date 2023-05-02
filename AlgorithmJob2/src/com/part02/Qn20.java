package com.part02;

import java.util.Scanner;

public class Qn20 {

	//GCD LCM
	//유클리드 호제법 gcd(a,b) = gcd(b,a%b)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int aLcm = a;
		int bLcm = b;
		int r = 0;
		int gcd = 0;
		int lcm = 0;
		
		while(true) {
			r = a%b;
			if(r==0) break;
			a = b;
			b = r;
		}
		gcd=b;
		
		lcm = (aLcm/gcd)*(bLcm/gcd)*gcd;
		
		System.out.println(gcd+"\n"+lcm);
	}
}
