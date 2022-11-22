package com.partq20;

import java.util.Scanner;

public class ProjectBomb {

	// 21Ка
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String st = sc.next();
			char[] stCh = st.toCharArray();
			
			String mo = "AEIOU";
			
			String ans = "";
			
			for(int i=0; i<stCh.length; i++) {
				boolean flag = false;
				for(int j=0; j<mo.length(); j++) {
					if(stCh[i]==mo.charAt(j)) {
						stCh[i] = ' ';
						flag = true;
					}
				}
				if(flag == false) ans+=stCh[i];
			}
			System.out.printf("#%d %s\n", t,ans);
		}
		
	}
}
