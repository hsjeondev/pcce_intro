package day07;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
		System.out.println(solution01.solution("abcdef", "f"));
		System.out.println(solution01.solution("BCBdbe", "B"));
		System.out.println();
		
		Solution02 solution02 = new Solution02();
		System.out.println(solution02.solution(70));
		System.out.println(solution02.solution(91));
		System.out.println(solution02.solution(180));
		System.out.println();
		
		Solution03 solution03 = new Solution03();
		System.out.println(solution03.solution(10, 3));
		System.out.println(solution03.solution(64, 6));
		System.out.println();
		
		Solution04 solution04 = new Solution04();
		System.out.println(solution04.solution(10));
		System.out.println(solution04.solution(4));
	}

}
