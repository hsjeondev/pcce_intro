package day09;

public class Solution03 {
	public String solution(String rsp) {
        String answer = "";
        
        char[] rspArr = rsp.toCharArray();
        
        for(char ch : rspArr) {
            if(ch == '2') {
                answer += 0;
            } else if(ch == '0') {
                answer += 5;
            } else {
                answer += 2;
            }
        }
        
        return answer;
    }
}
