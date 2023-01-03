package level00;

public class HateEnglish {

	public static void main(String[] args) {

		long result = solution("onetwothreefourfivesixseveneightnine");
		
	}

	public static long solution(String numbers) {
		long answer = 0;
		
		numbers.replaceAll("one", "1");
		System.out.println(numbers);
		return answer;
	}
}
