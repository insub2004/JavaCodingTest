package level00;

public class Dedupe {
	public static void main(String[] args) {

		String my_string = "We are the world";
		
		String answer = "";
		
//		while(true) {
//			if(my_string.equals("")) {
//				break;
//			}else {
//				answer.append(my_string.charAt(0));
//				my_string = my_string.replaceAll(Character.toString(my_string.charAt(0)), "");
//			}
//		}
//		
//		System.out.println(answer);
//		
//		String.valueOf(answer);
		
		for(int i=0; i<my_string.length(); i++) {
			if(i==my_string.indexOf(my_string.charAt(i))) {
				answer += my_string.charAt(i);
			}
		}
		
		System.out.println(answer);
		
	}
}
