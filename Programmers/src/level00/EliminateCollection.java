package level00;

public class EliminateCollection {

	public static void main(String[] args) {

		String str = "nice to meet you";
		String[] strarr = str.split("");
		String coll = "aeiou";
		String[] collarr = coll.split("");

//		StringBuilder sb = new StringBuilder();
//		
//		for (int i = 0; i < strarr.length; i++) {
//			boolean flag = false;
//			for (int j = 0; j < collarr.length; j++) {
//				if (strarr[i].equals(collarr[j])) {
//					flag = true;
//				}
//			}
//			if(flag==false) sb.append(strarr[i]);
//		}
//	
//		System.out.println(sb);
	
		System.out.println("replace");
		String str01 = "aajajaa1234bcde6f7g89";
		
		String result01 = str01.replace("a", "_");			//replace메서드 문자열 "a"를 _로 바꾸기
		System.out.println("result01   : " + result01);
		
		String result0101 = str01.replaceAll("a", "_");		//replaceAll메서드 문자열 "a"를 _로 바꾸기
		System.out.println("result0101 : " + result0101);
		
		String result02 = str01.replace("a1", "_");			//replace메서드는 연속된 문자열만 비교해서 교체
		System.out.println("result02 : " + result02);
		
		String result03 = str01.replace("aeiou", "_");		//비교되는 문자열이 없으면 교체하지 않음
		System.out.println("result03 : " + result03);
		
		
		System.out.println();
		System.out.println("replaceAll");
		String result04 = str01.replaceAll("[abcd]", "*");		//replaceAll메서드는 정규식을 이용해서 해당하는 모든 값들을 교체
		System.out.println("result04 :   " + result04);
		
		String result0401 = str01.replaceAll("[aeiou]", "*");	//replaceAll메서드로 모음 모두 *로 교체
		System.out.println("result0401 : " + result0401);
		
		String result05 = str01.replaceAll("[^0-9]", "*");		//replaceAll메서드로 숫자가 아닌 값 *로 교체
		System.out.println("result05 : " + result05);
		
		String result06 = str01.replaceAll("[0-9]", "*");		//replcaeAll메서드로 숫자들만 *로 교체
		System.out.println("result06 : " + result06);
		System.out.println();
	
		String str02 = "aaaaabc123123abcfabcfabc5345";
		
		System.out.println("replace메서드와 replaceAll메서드의 차이");
		String resultRe = str02.replace("abc", "#");
		String resultRe01 = str02.replace("a", "#").replace("b", "#").replace("c", "#");
		String resultReAll = str02.replaceAll("[abc]", "#");
		System.out.println("replace메서드    : " + resultRe);		//결국 replace메서드는 연속된 문자열만 교체해주고
		System.out.println("replace메서드 중복: " + resultRe01);	//replace메서드를 중복사용해서 replaceAll처럼 만들순 있다.
		System.out.println("replaceAll메서드 : " + resultReAll);	//replaceAll은 정규식에 해당하는 값 모두를 교체
		
		System.out.println();
		
		String str03 = "Hello World!!";
		String str0301 = str03.replaceAll(".", "*");
		String str0302 = str03.replaceFirst(".", "첫");
		String str0303 = str03.replaceFirst("o", "첫");
		
		System.out.println("str0301 : " + str0301);
		System.out.println("str0302 : " + str0302);
		System.out.println("str0303 : " + str0303);
	}
}