package 논리2_문제_배수약수;

public class 논리2_문제05_자리수의합_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				변수a의 각자리수별로 나눠서 전부 더한다.
				그합이 짝수이면 true 를 출력하는 식을 작성하시오.
			[정답]
				10
				true	
		*/
	
		int a = 3340;
		int b = (a / 1000);
		int c = (a % 1000 / 100);
		int d = (a % 100 / 10);
		int e = a % 10;
		int f = b + c + d + e;
		boolean g = (f % 2 == 0);

	}

}
