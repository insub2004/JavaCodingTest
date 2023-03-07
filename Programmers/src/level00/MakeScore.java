package level00;

import java.util.Arrays;
import java.util.List;

public class MakeScore {

	public static void main(String[] args) {
		int[] result;
		result = solution(new int[][] {{1,2}, {1,1}, {1,1}});
		
		for(int i : result) {
			System.out.println(i);
		}
	}
	
	/*
	 * 소수점일 경우를 계산 안했음
	 */
	
	public static int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		double[] average = new double[score.length];
		
		for(int i=0; i<score.length; i++) {
			average[i] = (score[i][0] + score[i][1])/2.0;
		}
		
		for(double i : average) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=0; i<average.length; i++) {
			int cnt = score.length;
			for(int j=0; j<average.length; j++) {
				if(i==j) continue;
				if(average[i]>=average[j]) cnt--;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
}
