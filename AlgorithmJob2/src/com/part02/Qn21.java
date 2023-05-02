package com.part02;

import java.util.Scanner;

public class Qn21 {

	//maxofarr
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int idxI = 0;
		int idxJ = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					idxI = i+1;
					idxJ = j+1;
				}else if(max==arr[i][j] && i<idxI) {
					idxI = i+1;
					idxJ = j+1;
				}else if(max==arr[i][j] && i==idxI) {
					idxJ = j+1;
				}
			}
		}
		
		System.out.println(max + "\n" + idxI + " " + idxJ);
	}
}
