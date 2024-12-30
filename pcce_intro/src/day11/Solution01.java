package day11;

public class Solution01 {
	public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int i = 0; i < box.length; i++) {
            box[i] /= n;
        }
        
        for(int b : box) {
            answer *= b;
        }
        
        return answer;
    }
}
