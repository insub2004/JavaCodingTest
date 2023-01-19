package level00;

import java.util.Arrays;
import java.util.Stack;

public class CtrlZ {

	public static void main(String[] args) {
		System.out.println(solution("10 Z 20 Z 1"));
	}
	
	public static int solution(String s) {
        int answer = 0;
//        String[] str = s.split(" ");
//
//        for(int i=0; i<str.length; i++) {
//        	if(str[i].equals("Z")) {
//        		answer-=Integer.valueOf(str[i-1]);
//        		continue;
//        	}
//        	answer+=Integer.valueOf(str[i]);
//        }
//        
        Stack<Integer> stack = new Stack<>();
        
        for(String w : s.split(" ")) {
        	if(w.equals("Z")) 
        		stack.pop();
        	else {
        		stack.push(Integer.parseInt(w));
        	}
        }
        
        for(int i : stack) {
        	answer += i;
        }
        
        return answer;
    }
}
