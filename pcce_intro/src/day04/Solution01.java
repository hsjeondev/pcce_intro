package day04;

public class Solution01 {
	public int solution(int n) {
        
        int pizza = n / 7;
        int piece = n % 7;
        
        return piece > 0 ? pizza + 1 : pizza;
    }
}
