package day11;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
		int[] box1 = {1, 1, 1};
        System.out.println(solution01.solution(box1, 1));
        int[] box2 = {10, 8, 6};
        System.out.println(solution01.solution(box2, 3));

        System.out.println();
        
        Solution03 solution03 = new Solution03();
        int[] numbers1 = {1, 2, 3, 4, 5};
        System.out.println(solution03.solution(numbers1));
        int[] numbers2 = {0, 31, 24, 10, 1, 9};
        System.out.println(solution03.solution(numbers2));
	}

}
