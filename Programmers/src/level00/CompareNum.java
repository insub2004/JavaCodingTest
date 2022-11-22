package level00;

import java.util.Scanner;

public class CompareNum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(solution(num1,num2));
		
	}

	private static int solution(int num1, int num2) {
		
		int ans = (num1==num2) ? 1:-1;
		
		return ans;
	}
	
	
}
