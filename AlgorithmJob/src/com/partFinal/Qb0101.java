package com.partFinal;

import java.util.Scanner;

public class Qb0101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"1qaz",
						  "2wsx",
						  "3edc",
						  "4rfv5tgb",
						  "6yhn7ujm",
						  "8ik,",
						  "9ol.",
						  "0-=p[];'/"
						  };
		
		String st = sc.next();
		int cnt[] = new int[8];
		
		for(int i=0; i<st.length(); i++) {	//st�ѱ��ھ��������� for��
			char val = st.charAt(i);		
			for(int j=0; j<arr.length; j++) {	//�迭�ȿ� ���������� �����ϴ� for��
				for(int k=0; k<arr[j].length(); k++) {	//ù ���ڿ� ���� ������ �� ���� for��
					if(val==arr[j].charAt(k)) {
						cnt[j]++;
						break;
					}
				}
			}
		}

		for(int i=0; i<cnt.length; i++) {
			System.out.print(cnt[i] + " ");
		}
		
	}
}
