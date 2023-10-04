package 기본1_문제_기본;

public class 기본1_문제01_큰따움표_문제 {
	public static void main(String[] args) {
		
		/*
		[1] 산술 연산자
			1. 더하기			+
			2. 빼기			-
			3. 곱하기			*
			4. 나누기			/
			5. 나머지			%
		
	 */
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		
		// 정수 / 정수 = 정수(몫)
		System.out.println(10 / 3);
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		// 실수 / 실수 = 실수
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
		
		System.out.println(10 % 3);
		
		/*
			[주의]
			곱하기와 나누기는 더하기 빼기 보다 우선순위가 높다.
			그래서 더하기나 빼기를 곱하기나 나누기 보다 먼저 하고 싶으면
			() 소괄호를 이용해야 한다.
			
			10 + 3 * 3		=	19
			(10 + 3) * 3	=	39
		 */
		
		System.out.println(10 - 3 * 2);
		System.out.println((10 - 3) * 2);
		
		
	}
}




