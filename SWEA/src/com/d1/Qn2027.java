package com.d1;

public class Qn2027 {
	
	// �밢�� ����ϱ�
	/*
	 *  #++++
		+#+++
		++#++
		+++#+
		++++#
		
		2���迭(�ݺ���) �Ẹ��� ���ε� 
	 */

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j) System.out.print('#');
				else System.out.print('+');
			}
			System.out.println();
		}
	}
	
}
