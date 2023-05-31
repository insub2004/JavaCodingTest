package level00;

public class NtoEnd {

}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = n-1;
        int[] answer = new int[num_list.length-idx];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[idx++];
        }
        
        return answer;
    }
}
