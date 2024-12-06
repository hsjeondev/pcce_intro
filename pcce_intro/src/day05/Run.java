package day05;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
		System.out.println(solution01.solution(150000));
		System.out.println(solution01.solution(580000));
		System.out.println();
		
		Solution02 solution02 = new Solution02();
		int[] arr2_1 = solution02.solution(5500);
		int[] arr2_2 = solution02.solution(15000);
		for(int i = 0; i < arr2_1.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(arr2_1[i]);
			if(i != arr2_1.length-1) {
				System.out.print(", ");
			}
			if(i == arr2_1.length-1) {
				System.out.println("]");
			}
		}
		for(int i = 0; i < arr2_2.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(arr2_2[i]);
			if(i != arr2_2.length-1) {
				System.out.print(", ");
			}
			if(i == arr2_2.length-1) {
				System.out.println("]");
			}
		}
		System.out.println();
		
		Solution03 solution03 = new Solution03();
		System.out.println(solution03.solution(40));
		System.out.println(solution03.solution(23));
		System.out.println();
		
		Solution04 solution04 = new Solution04();
		int[] arr4_1 = {1, 2, 3, 4, 5};
		int[] arr4_2 = {1, 1, 1, 1, 1, 2};
		int[] arr4_3 = {1, 0, 1, 1, 1, 3, 5};
		int[] answer1 = solution04.solution(arr4_1);
		int[] answer2 = solution04.solution(arr4_2);
		int[] answer3 = solution04.solution(arr4_3);
		for(int i = 0; i < answer1.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(answer1[i]);
			if(i != answer1.length-1) {
				System.out.print(", ");
			}
			if(i == answer1.length-1) {
				System.out.println("]");
			}
		}
		for(int i = 0; i < answer2.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(answer2[i]);
			if(i != answer2.length-1) {
				System.out.print(", ");
			}
			if(i == answer2.length-1) {
				System.out.println("]");
			}
		}
		for(int i = 0; i < answer3.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(answer3[i]);
			if(i != answer3.length-1) {
				System.out.print(", ");
			}
			if(i == answer3.length-1) {
				System.out.println("]");
			}
		}

	}

}
