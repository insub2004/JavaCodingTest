package level00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		
		String my_string = "hi12392";
		
		String []removeA = my_string.replaceAll("[^0-9]", "").split("");
		
		for(int i=0; i<removeA.length; i++) {
			System.out.printf("%s",removeA[i]);
		}
		
		int []answer = new int[removeA.length];
		System.out.println();
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(removeA[i]);
		}
		Arrays.sort(answer);
		for(int i=0; i<removeA.length; i++) {
			System.out.printf("%d",answer[i]);
		}
		System.out.println();
		//-----------------------------------------------
		
		//Character.digit() 사용해보기
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<my_string.length(); i++) {
			char charData = my_string.charAt(i);			//문자열에서 문자 하나씩 가져와
					
			if(Character.isDigit(charData)) {				//isDigit은 가져온 char가 숫자이면 true 아니면 false리턴
				String strData = String.valueOf(charData);	//숫자가 맞으면 문자열 list에 추가하기 위해사
															//String.valueOf()메서드를 이용해 문자열로 변환해주고
				
				list.add(strData);							//문자열 리스트에 추가한다
			}
		}
		
		int []ans01 = list.stream().sorted().mapToInt(Integer::parseInt).toArray();
		
		for(int i:ans01) {
			System.out.print(i+"");
		}
		System.out.println();
		
		//----------------------------------
		// stream을 이용해 한줄에 끝내기
		int []ans02 = Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
		for(int i:ans02) {
			System.out.print(i+"");
		}
		
	}
}
