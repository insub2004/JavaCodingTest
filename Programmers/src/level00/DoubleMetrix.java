package level00;

public class DoubleMetrix {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int[][] arr = solution(num_list,n);
		
		for(int i=0; i<num_list.length/n;i++) {
			System.out.print("[");
        	for(int j=0; j<n ; j++) {
        		System.out.print(arr[i][j] + ",");
        	}
        	System.out.print("]");
        	System.out.println();
        }
	}
	
	public static int[][] solution(int[] num_list, int n) {
        int[][] answer =new int[num_list.length/n][n];
        
        int idx = 0;
        for(int i=0; i<num_list.length/n;i++) {
        	for(int j=0; j<n ; j++) {
        		answer[i][j] = num_list[idx];
        		idx++;
        	}
        }
        
        return answer;
    }
}
