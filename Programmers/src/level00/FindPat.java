package level00;

public class FindPat {

	public static void main(String[] args) {
		int i = solution("AbCdEfG","aBc");
		System.out.println(i);
	}
	
	public static int solution(String myString, String pat) {
        int answer = 0;
        
        String str = myString.toUpperCase();
        
        if(str.contains(pat.toUpperCase()))answer = 1;
        
        return answer;
    }
}
