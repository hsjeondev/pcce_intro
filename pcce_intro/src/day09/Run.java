package day09;

public class Run {

	public static void main(String[] args) {
		
		Solution01 solution01 = new Solution01();
		System.out.println(solution01.solution(23));
		System.out.println(solution01.solution(24));
		System.out.println(solution01.solution(999));
		
		System.out.println();
		
		Solution02 solution02 = new Solution02();
		System.out.println(solution02.solution(".... . .-.. .-.. ---"));
		System.out.println(solution02.solution(".--. -.-- - .... --- -."	));
	
		System.out.println();
		
		Solution03 solution03 = new Solution03();
		System.out.println(solution03.solution("2"));
		System.out.println(solution03.solution("205"));
	
		System.out.println();
		
		Solution04 solution04 = new Solution04();
		System.out.println(solution04.solution(3, 2));
		System.out.println(solution04.solution(5, 3));
	}

}
