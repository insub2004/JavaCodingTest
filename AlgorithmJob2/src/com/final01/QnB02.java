package com.final01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QnB02 {

	//���� ����
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[200010];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			arr[i]=arr[i]%2;
		}

		//¦���� ��������
		List<Integer> arrList = new ArrayList<Integer>();
		
		//¦�� �ε��� ����
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) arrList.add(i);
		}
		
		
		
	}
}
