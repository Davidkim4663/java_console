package 변수3_문제_몫과나머지;

public class 변수3_문제01_색종이_정답 {

	public static void main(String[] args) {
		 /*
			[문제] 
				철수는 색종이를 20장 가지고있다.
				영희는 색종이를 14장 가지고있다.
				민수는 색종이를 6장 가지고있다.
				세학생의 색종이를 전부 합친다.
				
				[1] 색종이를 3사람이 똑같은 개수로 나눠가지면 
				    총 몇 장을 가질 수 있는지 구하시오.		
				[2] 위에서 나눠주고 난 나머지는 얼마인지 구하시오.
			[정답] 
				[1] 13
				[2] 1
		 */   
		
		int a1 = 20;
		int a2 = 14;
		int a3 = 6;
		int b = a1 + a2 + a3;
		int c = 3;
	
		int result1 = (b / c);
		int result2 = b % c;

	}

}
