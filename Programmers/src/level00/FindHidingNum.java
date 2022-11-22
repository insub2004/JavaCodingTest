package level00;

public class FindHidingNum {

	public static void main(String[] args) {
		
		String str = "aAb1B2cC34oOp";
		
		int answer = 0;
		
		String removeSt = str.replaceAll("[^0-9]", "");
		
		System.out.println(removeSt);
		
		for(int i=0; i<removeSt.length(); i++) {
			answer+=Integer.parseInt(String.valueOf(removeSt.charAt(i)));
		}
		
		System.out.println(answer);
		
	}
}
