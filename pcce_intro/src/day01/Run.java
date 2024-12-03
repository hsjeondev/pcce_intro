package day01;

public class Run {

	public static void main(String[] args) {
		Solution01 solution01 = new Solution01();
		int solution01_1 = solution01.solution(2, 3);
		System.out.println("2,3일 때 : " + solution01_1);
		int solution01_2 = solution01.solution(100, 2);
		System.out.println("100,2일 때 : " + solution01_2);
		System.out.println();
		
		Solution02 solution02 = new Solution02();
		int solution02_1 = solution02.solution(2, 3);
		System.out.println("2,3일 때 : " + solution02_1);
		int solution02_2 = solution02.solution(100, 2);
		System.out.println("2,3일 때 : " + solution02_2);
		System.out.println();
		
		Solution03 solution03 = new Solution03();
		int solution03_1 = solution03.solution(3, 4);
		System.out.println("3,4일 때 : " + solution03_1);
		int solution03_2 = solution03.solution(27, 19);
		System.out.println("27,19일 때 : " + solution03_2);
		System.out.println();
		
		Solution04 solution04 = new Solution04();
		int solution04_1 = solution04.solution(10, 5);
		System.out.println("10,5일 때 : " + solution04_1);
		int solution04_2 = solution04.solution(7, 2);
		System.out.println("7,2일 때 : " + solution04_2);
	}

}
