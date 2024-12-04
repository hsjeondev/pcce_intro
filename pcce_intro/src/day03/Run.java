package day03;

public class Run {

	public static void main(String[] args) {

		Solution01 solution01 = new Solution01();
		Solution02 solution02 = new Solution02();
		Solution03 solution03 = new Solution03();
		Solution04 solution04 = new Solution04();
		
		System.out.println("=== 나머지 구하기 ===");
		System.out.println(solution01.solution(3, 2));
		System.out.println(solution01.solution(10, 5));
		
		System.out.println();
		
		System.out.println("=== 중앙값 구하기 ===");
		int[] arr2_1 = {1,2,7,10,11};
		int[] arr2_2 = {9,-1,0};
		System.out.println(solution02.solution(arr2_1));
		System.out.println(solution02.solution(arr2_2));
		
		System.out.println();
		
		System.out.println("=== 최빈값 구하기 ===");
		int[] arr3_1 = {1,2,3,3,3,4};
		int[] arr3_2 = {1,1,2,2};
		int[] arr3_3 = {1};
		System.out.println(solution03.solution(arr3_1));
		System.out.println(solution03.solution(arr3_2));
		System.out.println(solution03.solution(arr3_3));
		
		System.out.println();
		
		System.out.println("=== 짝수는 싫어요 ===");
		int[] arr4_1 = solution04.solution(10);
		for(int i = 0; i < arr4_1.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(arr4_1[i]);
			if(i != arr4_1.length-1) {
				System.out.print(", ");
			}
			if(i == arr4_1.length-1) {
				System.out.println("]");
			}
		}
		int[] arr4_2 = solution04.solution(15);
		for(int i = 0; i < arr4_2.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(arr4_2[i]);
			if(i != arr4_2.length-1) {
				System.out.print(", ");
			}
			if(i == arr4_2.length-1) {
				System.out.println("]");
			}
		}
	}

}
