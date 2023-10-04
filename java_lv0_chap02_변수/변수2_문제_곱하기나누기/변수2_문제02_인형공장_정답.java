package 변수2_문제_곱하기나누기;

public class 변수2_문제02_인형공장_정답 {

	public static void main(String[] args) {
		 /*
			[문제]
				인형 공장에서 인형 10개를 생산하는데,
				불량을 염두해두고 1개씩 더 만든다.
				인형을 1200개 주문받았을 때,
				인형은 총 몇 개 생산해야 되는지 구하시오.	
			[정답] 
				1320
	 	*/
	
		/*
			[풀이]
				전체 생산해야할 인형
				= 주문수량 + 불량대비인형
				
				불량대비 인형
				= 1200 / 10 = 120개
	
				= 1200 + 1200 / 10
		*/
		
		double a = 1200;
		double b = 1200/ 10;
		double result = a + b;
		System.out.println(String.format("%.0f", result));
	}

}
