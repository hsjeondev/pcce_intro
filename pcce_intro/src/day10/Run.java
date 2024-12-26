package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
		List<Integer> list01 = new ArrayList<Integer>();
		List<Integer> list02 = new ArrayList<Integer>();
		list01.add(2);
		list01.add(4);
		System.out.println(solution01.solution(list01));
		list02.add(-7);
		list02.add(9);
		System.out.println(solution01.solution(list02));
		
        Solution02 solution02 = new Solution02();
        int[] numList1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;
        int[][] result1 = solution02.solution(numList1, n1);
        System.out.println(Arrays.deepToString(result1));
        int[] numList2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;
        int[][] result2 = solution02.solution(numList2, n2);
        System.out.println(Arrays.deepToString(result2));
		
        Solution03 solution03 = new Solution03();
        int[] numbers1 = {1, 2, 3, 4};
        int k1 = 2;
        System.out.println(solution03.solution(numbers1, k1));
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;
        System.out.println(solution03.solution(numbers2, k2));
        int[] numbers3 = {1, 2, 3};
        int k3 = 3;
        System.out.println(solution03.solution(numbers3, k3));
        
        Solution04 solution04 = new Solution04();
        int[] testNumbers1 = {1, 2, 3};
        String direction1 = "right";
        System.out.println(Arrays.toString(solution04.solution(testNumbers1, direction1)));

        int[] testNumbers2 = {4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";
        System.out.println(Arrays.toString(solution04.solution(testNumbers2, direction2)));
	}

}
