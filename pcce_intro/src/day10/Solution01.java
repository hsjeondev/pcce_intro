package day10;

import java.util.List;

public class Solution01 {
	public int solution(List<Integer> dot) {
        int answer = 0;
        int x = dot.get(0);
        int y = dot.get(1);
        
        if(x > 0 && y > 0) {
            answer = 1;
        } else if (x < 0 && y > 0) {
            answer = 2;
        } else if(x < 0 && y < 0) {
            answer = 3;
        } else if(x > 0 && y < 0) {
            answer = 4;
        }
        
        return answer;
    }
}
