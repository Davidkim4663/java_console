package 조건3_문제_추가계산;

import java.util.Random;

public class 조건문3_문제01_주사위두개_정답 {
	public static void main(String[] args) {
	
	   /*
	        [문제]
	            철수는 주사위 2개를 가지고 있다.
	            주사위는 눈금이 1~6까지 있다.
	            철수가 주사위 2개를 던졌을 때 그 합을 출력하시오.
	            단, 주사위 눈금이 서로 같으면 6을 추가로 더하시오.
	        
	            [예]
	                1, 2 ==> 3
	                1, 1 ==> 2 + 6
	    */
		
		int a = 0;
		int b = 0;
		int total = 0;
		
		Random ran = new Random();
		a = ran.nextInt(6) + 1;
		b = ran.nextInt(6) + 1;
		System.out.println(a + ", " + b);
		
		total = a + b;
		if(a == b) {
			total = total + 6;
		}
		
		System.out.println("합 = " + total);
		
	}
}
