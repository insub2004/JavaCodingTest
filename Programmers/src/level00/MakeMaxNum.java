package level00;

import java.util.Arrays;

public class MakeMaxNum {

	public static void main(String[] args) {
		
		int []numbers = {10,20,30,5,5,20,5};
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[numbers.length-1]*numbers[numbers.length-2]);
		
	}
}
