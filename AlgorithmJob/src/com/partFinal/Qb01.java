package com.partFinal;

import java.util.Scanner;

public class Qb01 {
	
	//제발 확인 좀 잘하자 100점인데 20점이 뭐냐
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String st = sc.next();

		char[] q = { '1', 'q', 'a', 'z' };
		char[] w = { '2', 'w', 's', 'x' };
		char[] e = { '3', 'e', 'd', 'c' };
		char[] r = { '4', 'r', 'f', 'v' };
		char[] t = { '5', 't', 'g', 'b' };
		char[] y = { '6', 'y', 'h', 'n' };
		char[] u = { '7', 'u', 'j', 'm' };
		char[] i = { '8', 'i', 'k', ',' };
		char[] o = { '9', 'o', 'l', '.' };
		char[] p = { '0', '-', '=', 'p', '[', ']', ';', '/','\'' };

		char[] arrChar = new char[st.length()];
		int len = arrChar.length;
		for (int k = 0; k < st.length(); k++) {
			arrChar[k] = st.charAt(k);
		}

		int[] cnt = new int[8];
		
		for (int a = 0; a < st.length(); a++) {
			char val = st.charAt(a);
			for (int i1 = 0; i1 < 4; i1++) {
				if (q[i1] == val) {
					cnt[0]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (w[i1] == val) {
					cnt[1]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (e[i1] == val) {
					cnt[2]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (r[i1] == val) {
					cnt[3]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (t[i1] == val) {
					cnt[3]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (y[i1] == val) {
					cnt[4]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (u[i1] == val) {
					cnt[4]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (i[i1] == val) {
					cnt[5]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 4; i1++) {
				if (o[i1] == val) {
					cnt[6]++;
					break;
				}
			}
			for (int i1 = 0; i1 < 9; i1++) {
				if (p[i1] == val) {
					cnt[7]++;
					break;
				}
			}
		}

		for (int z = 0; z < cnt.length; z++) {
			System.out.printf("%d ", cnt[z]);
		}
	}
	
}
