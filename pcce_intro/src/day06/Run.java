package day06;

public class Run {

	public static void main(String[] args) {

		Solution01 solution01 = new Solution01();
		System.out.println(solution01.solution("jaron"));
		System.out.println(solution01.solution("bread"));
		
		System.out.println();
		
		Solution02 solution02 = new Solution02();
		solution02.solution(3);
		
		System.out.println();
		
		Solution03 solution03 = new Solution03();
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 3, 5, 7};
		int[] answer1 = solution03.solution(arr1);
		int[] answer2 = solution03.solution(arr2);
		for(int i = 0; i < answer1.length; i++) {
			if(i == answer1.length-2) {
				System.out.print("[");
			}
			System.out.print(answer1[i]);
			if(i == answer1.length-2) {
				System.out.print(", ");
			}
			if(i == answer1.length-1) {
				System.out.println("]");
			}
		}
		for(int i = 0; i < answer2.length; i++) {
			if(i == answer2.length-2) {
				System.out.print("[");
			}
			System.out.print(answer2[i]);
			if(i == answer2.length-2) {
				System.out.print(", ");
			}
			if(i == answer2.length-1) {
				System.out.println("]");
			}
		}
		
		System.out.println();

		Solution04 solution04 = new Solution04();
		System.out.println(solution04.solution("hello", 3));
	}

}
