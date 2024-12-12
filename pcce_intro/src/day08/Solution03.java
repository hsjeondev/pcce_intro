package day08;

public class Solution03 {
	    public int[] solution(int[] emergency) {
	        int[] answer = new int[emergency.length];
	        int[] sortEmergency = new int[emergency.length];
	        
	        for (int i = 0; i < emergency.length; i++) {
	            sortEmergency[i] = emergency[i];
	        }
	        
	        for (int i = 0; i < sortEmergency.length; i++) {
	            for (int j = i + 1; j < sortEmergency.length; j++) {
	                if (sortEmergency[i] < sortEmergency[j]) {
	                    int temp = sortEmergency[i];
	                    sortEmergency[i] = sortEmergency[j];
	                    sortEmergency[j] = temp;
	                }
	            }
	        }


	        for (int i = 0; i < emergency.length; i++) {
	            for (int j = 0; j < emergency.length; j++) {
	                if (emergency[i] == sortEmergency[j]) {
	                    answer[i] = j + 1;
	                    break;
	                }
	            }
	        }
	        
	        return answer;
	    }
	}

