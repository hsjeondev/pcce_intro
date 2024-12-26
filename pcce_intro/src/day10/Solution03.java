package day10;

public class Solution03 {
	public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int index = 0;
        for(int i = 0; i < k; i++) {
            answer = numbers[index];
            index = (index + 2) % numbers.length;
        }
        
        return answer;
    }
}
