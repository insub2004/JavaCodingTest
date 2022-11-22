package level00;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//double answer = Double.parseDouble(String.format("%.0f",(double)num1/num2*1000));
		//int ans = (int) answer;
		
		//System.out.print(ans);
		
		double res = (double)num1/num2*1000;
		int resans = (int) res;
		System.out.println(resans);
	}

	
}
