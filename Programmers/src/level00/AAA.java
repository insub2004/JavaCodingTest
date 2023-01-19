package level00;

public class AAA {
	public static void main(String[] args) {

		String str = "awrqfvvssbbgqqef";
		String answer = "";
		String[] arr = {"a", "v", "q"};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(str.replaceFirst(arr[i], "_").replaceFirst(str, answer));
		}
		
	}
}
