package day04;

public class Solution03 {
	public int solution(int slice, int n) {
        int answer = 1;
        
        while (true) {
            if ((answer * slice) < n) {
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
