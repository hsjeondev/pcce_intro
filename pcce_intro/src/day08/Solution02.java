package day08;

public class Solution02 {
	public String solution(int age) {
        String answer = "";
        
        String strAge = Integer.toString(age);
        
        char[] arr = new char[strAge.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (char)('1' + strAge.charAt(i));
        }
        
        answer = new String(arr);
        
        return answer;
    }
}
