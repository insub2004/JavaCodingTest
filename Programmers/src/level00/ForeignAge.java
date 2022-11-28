package level00;

public class ForeignAge {

	public static void main(String[] args) {

		int age = 23;
		StringBuilder sb = new StringBuilder();
		// 'a' -> 97

		while (age > 0) {
			sb.append((char)(97 + age % 10));
			age /= 10;
		}

		System.out.println(sb.reverse());
		System.out.println((char) (97 + 2));
	}

}
