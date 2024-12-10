package day07;

public class Solution03 {
	public int solution(int n, int k) {
        int answer = 0;
        
        int serviceCount = n / 10;
        int mainPrice = n * 12000;
        int beveragePrice = (k - serviceCount) * 2000;
        answer = mainPrice + beveragePrice;
        return answer;
    }
}
