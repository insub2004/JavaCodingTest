package level00;

import java.util.Scanner;

public class CompleteRact02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[2];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = solution(arr);
		
		System.out.println(cnt);
	}
	
	public static int solution(int[] sides) {
        int answer = 0;
        
		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);
        
		answer += Math.abs((max-min)-max);
		answer += Math.abs((max+min)-(max+1));
		
        return answer;
    }
	
}
