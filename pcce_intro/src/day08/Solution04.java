package day08;

public class Solution04 {
	public int solution(int n) {
        int answer = 0;
        
        int num = 1;
        
        for(int i = 1; i <= n; i++) {
            if(n % num == 0) {
                answer++;
            }
            num++;
        }
        
        return answer;
    }
}
