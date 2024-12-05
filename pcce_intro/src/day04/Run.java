package day04;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
		Solution02 solution02 = new Solution02();
		Solution03 solution03 = new Solution03();
		Solution04 solution04 = new Solution04();
		
		System.out.println(solution01.solution(7));
		System.out.println(solution01.solution(1));
		System.out.println(solution01.solution(15));
		System.out.println();

		System.out.println(solution02.solution(6));
		System.out.println(solution02.solution(10));
		System.out.println(solution02.solution(4));
		System.out.println();
		
		System.out.println(solution03.solution(7, 10));
		System.out.println(solution03.solution(4, 12));
		System.out.println();
		
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(solution04.solution(arr1));
		System.out.println(solution04.solution(arr2));
	}

}
