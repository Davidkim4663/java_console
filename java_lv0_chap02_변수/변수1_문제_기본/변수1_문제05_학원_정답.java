package 변수1_문제_기본;

public class 변수1_문제05_학원_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  	
				철수는 학교를 갈때는 바로 가고 집에올때는 학원에 들려서 집으로 돌아온다. 
	
				집에서 학교까지의 거리는 1278.5m이고, 학교에서 학원까지의 거리는 532.7m 이고, 
				학원에서 집까지의 거리는 1110.4m 이다. 오늘 철수가 걸은 거리는 총 몇m인지 구하시오.
				단, 소수점 1자리까지구하시오.
			[정답] 
				2921.6
		 */ 
		double a = 1278.5;
		double b = 532.7;
		double c = 1110.4;
		double result = a + b + c;
		System.out.println(String.format("%.1f", result));
	}

}
