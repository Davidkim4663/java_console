package 논리3_문제_랜덤;

import java.util.Random;

public class 논리3_문제06_철수암호4_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 암호숫자를 만들었다. 
				암호숫자의 규칙은 모든자리의 숫자가 짝수이거나,
				모든자리의 숫자가 홀수이면 통과이다.
	
				랜덤으로 10~99 사이의 숫자를 저장하고,
				그 숫자가 철수의 암호와 일치하면 true 를 출력하는 식을 작성하시오.
				
			[예시]
				랜덤 : 22
				true
		*/
		Random ran = new Random();
		
		int a = ran.nextInt(90) + 10;
	
		int b = (a / 10);
		int c = a % 10;
	
		boolean d = b % 2 == 0 && c % 2 == 0;
		boolean e = b % 2 == 1 && c % 2 == 1;
	
		boolean f = d || e;

	}

}
