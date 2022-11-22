package level00;

import java.util.Scanner;

public class PrintAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		System.out.println(solution(age));
	}
	
	public static int solution(int age) {
		int answer=0;
		
		answer = (2022-age)+1;
		
		return answer;
	}
}
