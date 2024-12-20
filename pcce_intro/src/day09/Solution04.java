package day09;

public class Solution04 {
	public long solution(int balls, int share) {
        long result = 1;
        
        if (balls == share || share == 0) {
            return 1;
        }

        if (share > balls - share) { 
            share = balls - share;
        }

        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }

        return result;
    }
}
