package day07;

public class Solution01 {
	public String solution(String my_string, String letter) {
        String answer = "";
        
        int count = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != letter.charAt(0)) {
                count++;
            }
        }
        
        int index = 0;
        char[] arr = new char[count];
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != letter.charAt(0)) {
                arr[index++] = my_string.charAt(i);
            }
            
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}
