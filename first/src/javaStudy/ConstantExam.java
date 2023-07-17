package javaStudy;

public class ConstantExam {

	public static void main(String[] args) {
		// 상수(常數)란 수식에서 변하지 않는 값을 의미한다.
		int i;
		i = 10;
		i =5;
		//상수를 선언할 땐 앞에 final을 붙여준다.
		final int J;
		//상수는 대문자의 명명규칙을 사용한다.
		J = 10;		
//		J=5; 오류
		
		double circleArea;//변수의 명명규칙
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		
		final int OIL_PRICE = 1390;
		// 상수의 단어들 같은 경우 단어 사이 언더바 넣기
		
		int totalPrice = 50 * OIL_PRICE;
		
		
	}

}
