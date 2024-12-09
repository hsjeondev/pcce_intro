package day06;

public class Solution01 {
	public String solution(String my_string) {
        String answer = "";
        
        char[] arr = new char[my_string.length()];
        arr = my_string.toCharArray();
        
        for(int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
       answer = new String(arr); 
        
        return answer;
    }
}
