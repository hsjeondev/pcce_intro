package day08;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
        int[] arr1_1 = {1, 2, 3, 4, 5};
        int[] arr2_1 = {1, 3, 5};
        int[] answer1_1 = solution01.solution(arr1_1, 1, 3);
        int[] answer2_1 = solution01.solution(arr2_1, 1, 2);
        System.out.print("[");
        for (int i = 0; i < answer1_1.length; i++) {
            System.out.print(answer1_1[i]);
            if (i < answer1_1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < answer2_1.length; i++) {
            System.out.print(answer2_1[i]);
            if (i < answer2_1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println();
		

        Solution02 solution02 = new Solution02();
        System.out.println(solution02.solution(23));
        System.out.println(solution02.solution(51));
        System.out.println(solution02.solution(100));
        
        System.out.println();
        
        Solution03 solution03 = new Solution03();
        int[] arr3_1 = {3,76,24};
        int[] arr3_2 = {1,2,3,4,5,6,7};
        int[] arr3_3 = {30,10,23,6,100};        
        int[] answer3_1 = solution03.solution(arr3_1);
        int[] answer3_2 = solution03.solution(arr3_2);
        int[] answer3_3 = solution03.solution(arr3_3);
        System.out.print("[");
        for (int i = 0; i < answer3_1.length; i++) {
            System.out.print(answer3_1[i]);
            if (i < answer3_1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < answer3_2.length; i++) {
            System.out.print(answer3_2[i]);
            if (i < answer3_2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < answer3_3.length; i++) {
            System.out.print(answer3_3[i]);
            if (i < answer3_3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println();
        
        Solution04 solution04 = new Solution04();
        System.out.println(solution04.solution(20));
        System.out.println(solution04.solution(100));
	}

}
