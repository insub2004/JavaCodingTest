package level00;

import java.util.Arrays;

public class ReversStr {

	public static void main(String[] args) {
		
		String my_string = "nordes";
		
		StringBuilder sb = new StringBuilder();
        sb.append(my_string);
		sb.reverse();
		
		System.out.println(sb.toString());
	
		char[] ch = my_string.toCharArray();
		
	}
	
}
