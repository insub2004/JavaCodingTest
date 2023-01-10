package level00;

public class ThrowBall02 {
	public static void main(String[] args) {
		System.out.println();
	}
	
	public static int solution(int[] numbers, int k) {
		int player = 1;
		
		for(int i=0; i<k-1; i++) {
			player+=2;
			if(player>numbers.length) player-=numbers.length;
		}
		
		return player;
	}
}
