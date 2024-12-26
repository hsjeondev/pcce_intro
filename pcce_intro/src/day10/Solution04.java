package day10;

public class Solution04 {
	public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")) {
            for(int i = 0; i < answer.length; i++) {
                if(i == answer.length-1) {
                    answer[0] = numbers[numbers.length-1];
                    continue;
                }
                answer[i+1] = numbers[i];
                
            }
        } else if(direction.equals("left")) {
            for(int i = 0; i < answer.length; i++) {
                if(i == answer.length-1) {
                    answer[answer.length-1] = numbers[0];
                    continue;
                }
                answer[i] = numbers[i+1];
            }
        }
        
        return answer;
    }
}
