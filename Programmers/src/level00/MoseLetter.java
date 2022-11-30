package level00;

import java.util.Arrays;

public class MoseLetter {

	public static void main(String[] args) {
		
		String answer = "";
		
		String letter = ".--. -.-- - .... --- -.";
		
		String []arrStr = letter.split(" ");
		
		System.out.println(Arrays.toString(arrStr));
		
		String []mose = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		
		for(int i=0; i<arrStr.length; i++) {
			for(int j=0; j<mose.length; j++) {
				if(arrStr[i].equals(mose[j])) {
					answer += (char)(j + 'a');		// j + 'a'
				}
			}
		}
		System.out.println(answer);
	}
}
