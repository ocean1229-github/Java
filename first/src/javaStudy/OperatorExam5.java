package javaStudy;

public class OperatorExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1 = (5 < 4) ? 50 : 40;
		// 만약 조건 값이 참이면 첫 번째 값을
		// 조건 값이 불이면 두 번째 값을 넣어주세요.
		
		System.out.println(b1);
		//40
		
		int b2 =0;
		if(5>4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		
		System.out.println(b2);
	}

}
