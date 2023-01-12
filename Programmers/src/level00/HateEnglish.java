package level00;

public class HateEnglish {

	public static void main(String[] args) {

		long result = solution("onetwothreefourfivesixseveneightnine");
		System.out.println(result);
	}

//	public static String[] NUM_STRING = {"zero","one","two","three","four","five", "six","seven","eight","nine"};
//	public static String[] NUM_INT = {"0","1","2","3","4","5","6","7","8","9"};
	
	public static long solution(String numbers) {
		long answer = 0;

//		for(int i=0; i<10; i++) {
//			numbers = numbers.replace(NUM_STRING[i], NUM_INT[i]);
//		}
//		answer = Long.valueOf(numbers);
		
		numbers = numbers.replace("zero", "0")
						 .replace("one", "1")
						 .replace("two", "2")
						 .replace("three", "3")
						 .replace("four", "4")
						 .replace("five", "5")
						 .replace("six", "6")
						 .replace("seven", "7")
						 .replace("eight", "8")
						 .replace("nine", "9");
		
		answer = Long.parseLong(numbers);
		return answer;
	}
}
