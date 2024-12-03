package day02;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
		Solution02 solution02 = new Solution02();
		Solution03 solution03 = new Solution03();
		Solution04 solution04 = new Solution04();
		
		int result1_1 = solution01.solution(3, 2);
		int result1_2 = solution01.solution(7, 3);
		int result1_3 = solution01.solution(1, 16);

		System.out.println(result1_1);
		System.out.println(result1_2);
		System.out.println(result1_3);
		System.out.println();
		
		int result2_1 = solution02.solution(2, 3);
		int result2_2 = solution02.solution(11, 11);
		int result2_3 = solution02.solution(7, 99);
		
		System.out.println(result2_1);
		System.out.println(result2_2);
		System.out.println(result2_3);
		System.out.println();
		
		int[] result3_1 = solution03.solution(1, 2, 3, 4);
		int[] result3_2 = solution03.solution(9, 2, 1, 3);
		
		for(int i = 0; i < result3_1.length; i++) {
			if(i == result3_1.length-2) {
				System.out.print("[");
				System.out.print(result3_1[i] + ", ");
			}
			if(i == result3_1.length-1) {
				System.out.print(result3_1[i]);
				System.out.print("]");
			}
		}
		System.out.println();
		for(int i = 0; i < result3_2.length; i++) {
			if(i == result3_2.length-2) {
				System.out.print("[");
				System.out.print(result3_2[i] + ", ");
			}
			if(i == result3_2.length-1) {
				System.out.print(result3_2[i]);
				System.out.print("]");
			}
		}
		System.out.println();
		System.out.println();
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 2, 100, -99, 1, 2, 3};
		int[] result4_1 = solution04.solution(arr1);
		int[] result4_2 = solution04.solution(arr2);
		
		for(int i = 0; i < result4_1.length; i++) {
			if(i == result4_1.length-5) {
				System.out.print("[");
			}
			
			System.out.print(result4_1[i]);
			
			if(i != result4_1.length-1) {
			System.out.print(", ");
			}
			if(i == result4_1.length-1) {
				System.out.print("]");
			}
		}
		System.out.println();
		
		for(int i = 0; i < result4_2.length; i++) {
			if(i == result4_2.length-7) {
				System.out.print("[");
			}
			
			System.out.print(result4_2[i]);
			
			if(i != result4_2.length-1) {
			System.out.print(", ");
			}
			if(i == result4_2.length-1) {
				System.out.print("]");
			}
		}
	}

}
