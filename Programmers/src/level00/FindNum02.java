package level00;

import java.util.Arrays;

public class FindNum02 {

	public static void main(String[] args) {
		int result = solution("aAb1B2cC34oOp");
	}
	public static int solution(String my_string) {
        int answer = 0;
        
        String str = my_string.replaceAll("[a-zA-Z]", " ");
        System.out.println(str);
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        for(int i=0; i<strArr.length; i++) {
        	if(!(strArr[i].equals(""))) {
            	answer += Integer.valueOf(strArr[i]);
        	}
        }
        System.out.println(answer);
        
        return answer;
    }
}
