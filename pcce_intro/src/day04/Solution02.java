package day04;

public class Solution02 {
	public int solution(int n) {
        int pizzas = 1;
        
        while(true) {
            if(pizzas * 6 % n != 0) {
                pizzas++;
            } else {
                 break;
            }
        }
        
        return pizzas;
    }
}
