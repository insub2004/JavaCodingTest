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
		//n이 무조건 4 r이 무조건 3이면
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
	        int k = sc.nextInt(); // 표시해야 할 남은 1을 의미
	        ary = new int[n]; // 이진 패턴을 표현할 배열

	        printPattern(0, k);

	}
	 // printPattern는 x위치에서 1의 표시할 수 있는지 검사하고 표시.
    static void printPattern(int x, int k) {
        if (k == 0) { // 표시해야할 1이 없다면 출력
            for (int i = 0; i < n; i++) {
                System.out.print(ary[i]);
            }
            System.out.println();
        } else {
            for (int j = x; j < n; j++) {

                ary[j] = 1; // 아직 1을 표시할 수 있는 기회가 남아있다면 j번째 위치에 1을 표시
                printPattern(j + 1, k - 1); // j위치에 표시하고 j+1위치에서 1을 출력할 수 있는지 검사, k값은 1을 한번 출력했으니 -1;
                ary[j] = 0; // j위치에서 1을 표시할 수 있는지 모두 검사하였으면, j위치의 값은 0
            }
        }
    }
}
