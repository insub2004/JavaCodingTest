package level00;

import java.util.Arrays;

public class StringSortSecond {

	public static void main(String[] args) {
		
		String my_string = "Bcad";
		
		char[] arrayCh = my_string.toLowerCase().toCharArray();
		
		Arrays.sort(arrayCh);
		String.valueOf(arrayCh);
		System.out.println(arrayCh);
		System.out.println(arrayCh.toString());
		
	}
}
