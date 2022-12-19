package level00;

import java.util.Arrays;

public class CountOnlyOneChar {

	public static void main(String[] args) {
		
		String answer = solution("hello");
		System.out.println(answer);
	}
	
	public static String solution(String s) {
//        String answer = "";
//        String str = s;
//        
//        for(int i=0; i<str.length(); i++) {
//        	int cnt = 0;
//        	char a = str.charAt(i);
//        	for(int j=0; j<str.length(); j++) {
//        		if(a == str.charAt(j)) cnt++;
//        	}
//        	if(cnt==1) answer+=a;
//        }
//        char[] charArr = answer.toCharArray();
//        Arrays.sort(charArr);
//        return String.valueOf(charArr);
		int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();
    }
	
}
