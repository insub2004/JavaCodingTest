package level00;

public class DecodePass {

	public static void main(String[] args) {
		
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		
		String answer = "";
        for(int i=1; i<=cipher.length()/code; i++){
            answer+=cipher.charAt(i*code-1);
        }
        System.out.println(answer);
        
        StringBuilder sb = new StringBuilder(cipher);
        sb.reverse();
        System.out.println(sb);
		
	}
}
