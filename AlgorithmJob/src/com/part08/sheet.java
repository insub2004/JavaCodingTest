package com.part08;

import java.util.Scanner;

public class sheet {
	static int n;
    static int[] ary;
	public static void main(String[] args) {
		/*
		char a = 0+'a';
		char b = 1+'a';
		char c = 3+'0';
		System.out.println((int)1+'a');
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
		System.out.println("-------------------");
		/*
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i != j) System.out.printf("%c%c\n", i+'a', j+'a');
			}
			
		}
		*/
		System.out.println("-------------------");
		//n�� ������ 4 r�� ������ 3�̸�
		/*
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					if(i!=j && j!=k && i!=k) 
						System.out.printf("%c%c%c\n",i+'a',j+'a',k+'a');
				}
			}
		}
		*/
		 Scanner sc = new Scanner(System.in);

	        n = sc.nextInt();
	        int k = sc.nextInt(); // ǥ���ؾ� �� ���� 1�� �ǹ�
	        ary = new int[n]; // ���� ������ ǥ���� �迭

	        printPattern(0, k);

	}
	 // printPattern�� x��ġ���� 1�� ǥ���� �� �ִ��� �˻��ϰ� ǥ��.
    static void printPattern(int x, int k) {
        if (k == 0) { // ǥ���ؾ��� 1�� ���ٸ� ���
            for (int i = 0; i < n; i++) {
                System.out.print(ary[i]);
            }
            System.out.println();
        } else {
            for (int j = x; j < n; j++) {

                ary[j] = 1; // ���� 1�� ǥ���� �� �ִ� ��ȸ�� �����ִٸ� j��° ��ġ�� 1�� ǥ��
                printPattern(j + 1, k - 1); // j��ġ�� ǥ���ϰ� j+1��ġ���� 1�� ����� �� �ִ��� �˻�, k���� 1�� �ѹ� ��������� -1;
                ary[j] = 0; // j��ġ���� 1�� ǥ���� �� �ִ��� ��� �˻��Ͽ�����, j��ġ�� ���� 0
            }
        }
    }
}
