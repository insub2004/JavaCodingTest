package level00;

public class FindNum02 {

	public static void main(String[] args) {
		int result = solution("aAb1B2cC34oOp");
	}
	public static int solution(String my_string) {
        int answer = 0;
        
        String str = my_string.replaceAll("[a-zA-Z]", "0");
        System.out.println(str);
        int idx = 0;
        while(idx > str.length()) {
        	char ch = str.charAt(idx);
        	if(ch!='0') {
        		
        	}
        }
        return answer;
    }
}
