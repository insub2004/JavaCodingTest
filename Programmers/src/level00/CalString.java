package level00;

import java.util.Arrays;

public class CalString {
	public static void main(String[] args) {
		System.out.println(solution("3 + 4 + 2 + 5 - 2 - 5 + 10"));
	}
	public static int solution(String my_string) {
		String[] strArr = my_string.split(" ");
		int answer = Integer.parseInt(strArr[0]);
		System.out.println(Arrays.toString(strArr));
		for(int i=1; i<strArr.length; i++) {
			switch(strArr[i]) {
			 	case"+": 
			 		answer+=Integer.parseInt(strArr[i+1]);
			 		break;
			 	case"-":
			 		answer-=Integer.parseInt(strArr[i+1]);
			 		break;
			}
		}

        return answer;
    }
}
