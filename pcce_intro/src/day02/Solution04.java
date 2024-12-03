package day02;

public class Solution04 {
	public int[] solution(int[] numbers) {
        int[] answer = numbers;
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}
