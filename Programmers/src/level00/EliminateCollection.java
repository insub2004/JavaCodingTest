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
		
		String result01 = str01.replace("a", "_");			//replace�޼��� ���ڿ� "a"�� _�� �ٲٱ�
		System.out.println("result01   : " + result01);
		
		String result0101 = str01.replaceAll("a", "_");		//replaceAll�޼��� ���ڿ� "a"�� _�� �ٲٱ�
		System.out.println("result0101 : " + result0101);
		
		String result02 = str01.replace("a1", "_");			//replace�޼���� ���ӵ� ���ڿ��� ���ؼ� ��ü
		System.out.println("result02 : " + result02);
		
		String result03 = str01.replace("aeiou", "_");		//�񱳵Ǵ� ���ڿ��� ������ ��ü���� ����
		System.out.println("result03 : " + result03);
		
		
		System.out.println();
		System.out.println("replaceAll");
		String result04 = str01.replaceAll("[abcd]", "*");		//replaceAll�޼���� ���Խ��� �̿��ؼ� �ش��ϴ� ��� ������ ��ü
		System.out.println("result04 :   " + result04);
		
		String result0401 = str01.replaceAll("[aeiou]", "*");	//replaceAll�޼���� ���� ��� *�� ��ü
		System.out.println("result0401 : " + result0401);
		
		String result05 = str01.replaceAll("[^0-9]", "*");		//replaceAll�޼���� ���ڰ� �ƴ� �� *�� ��ü
		System.out.println("result05 : " + result05);
		
		String result06 = str01.replaceAll("[0-9]", "*");		//replcaeAll�޼���� ���ڵ鸸 *�� ��ü
		System.out.println("result06 : " + result06);
		System.out.println();
	
		String str02 = "aaaaabc123123abcfabcfabc5345";
		
		System.out.println("replace�޼���� replaceAll�޼����� ����");
		String resultRe = str02.replace("abc", "#");
		String resultRe01 = str02.replace("a", "#").replace("b", "#").replace("c", "#");
		String resultReAll = str02.replaceAll("[abc]", "#");
		System.out.println("replace�޼���    : " + resultRe);		//�ᱹ replace�޼���� ���ӵ� ���ڿ��� ��ü���ְ�
		System.out.println("replace�޼��� �ߺ�: " + resultRe01);	//replace�޼��带 �ߺ�����ؼ� replaceAlló�� ����� �ִ�.
		System.out.println("replaceAll�޼��� : " + resultReAll);	//replaceAll�� ���ԽĿ� �ش��ϴ� �� ��θ� ��ü
		
		System.out.println();
		
		String str03 = "Hello World!!";
		String str0301 = str03.replaceAll(".", "*");
		String str0302 = str03.replaceFirst(".", "ù");
		String str0303 = str03.replaceFirst("o", "ù");
		
		System.out.println("str0301 : " + str0301);
		System.out.println("str0302 : " + str0302);
		System.out.println("str0303 : " + str0303);
	}
}