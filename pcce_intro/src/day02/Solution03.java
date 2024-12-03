package day02;

public class Solution03 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        answer[1] = denom1 * denom2;
        answer[0] = numer1 * denom2 + numer2 * denom1;
        
        int min = answer[0];
        if (answer[1] < min) {
            min = answer[1];
        }
        
        for(int i = min; i > 1; i--) {
            if(answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] /= i;
                answer[1] /= i;
                break;
            }
        }
        
        return answer;
    }
}
