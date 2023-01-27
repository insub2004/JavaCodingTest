package level00;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharactorXY {

	public static void main(String[] args) {
		int[] intArr = solution(new String[]{"left", "left", "left", "right"},new int[] {3,3});
		IntStream intS = Arrays.stream(intArr);
		intS.forEach(System.out::print);
	}
	
	public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i=0; i<keyinput.length; i++) {
        	switch(keyinput[i]) {
        		case "left": 
        			if(Math.abs(answer[0]) < board[0]/2 || answer[0] == board[0]/2) answer[0]--;
        			break;
        		case "right":
        			if(Math.abs(answer[0]) < board[0]/2 || answer[0] == -board[0]/2) answer[0]++;
        			break;
        		case "down":
        			if(Math.abs(answer[1]) < board[1]/2 || answer[1] == board[1]/2) answer[1]--;
        			break;
        		case "up":
        			if(Math.abs(answer[1]) < board[1]/2 || answer[1] == -board[1]/2) answer[1]++;
        	}
        	
        }
        
        return answer;
    }
}
