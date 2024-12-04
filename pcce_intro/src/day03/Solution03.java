package day03;

public class Solution03 {
	public int solution(int[] array) {
        int answer = -1;
        int maxCount = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                answer = array[i];
                isDuplicate = false;
            } else if (count == maxCount && answer != array[i]) {
                isDuplicate = true;
            }
        }

        return isDuplicate ? -1 : answer;
    }
}
