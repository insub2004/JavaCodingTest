package level00;

public class StringN {

	public static void main(String[] args) {
	
	}
	
	public String solution(String my_string, int n) {
        String answer = "";
        return my_string.substring(my_string.length()-n);
    }
}
