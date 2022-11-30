package level00;

public class Samyuckku {

	public static void main(String[] args) {
		
		int order = 100;
		int answer = 0;
        while(order>0){
            if(order%10!=0 && (order%10)%3==0) answer++;
            order/=10;
        }
        System.out.println(answer);
		
	}
}
