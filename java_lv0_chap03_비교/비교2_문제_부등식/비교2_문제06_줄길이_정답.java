package 비교2_문제_부등식;

public class 비교2_문제06_줄길이_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				길이가 몇미터인지모르는  줄의 끝에서 3미터를 잘라 내고 남은 길이는 2미터보다 짧다.
				단, 줄은 미터 단위이다. 
				위 식의 결과가 true 가 나올수있도록 , c의 값을 구하시오.
				단, 부등식이므로 정답에 가장가까운 정수를 구하시오. 
			[정답]
				4
		*/
    
		int a = 3;
		int b = 2;
		int c = 0;
	
		c = 2 + 3 - 1; // 작다이므로 1을 빼준다.
		boolean d = c - a < b;
	}

}
