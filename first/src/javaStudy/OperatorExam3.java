package javaStudy;

public class OperatorExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = 15;
		System.out.println((a - b) * c);
		// 우선순위 : () -> * -> -
		//-75
		System.out.println(a > 5 && b > 5);
		// 우선순위 : && ->  >
		// false
//		System.out.println(++a - 5);
		// ++은 전위연산자
		// 우선순위 : 다낭연산자 -> 산술연산자
		// a 에 1더한 후 - 5가 계산됨.
		System.out.println(a++ - 5);
		// 예외) 후위 연산자는 산술 연산자 계산 후 적용이 된다.
		System.out.println(a);
		
	}

}
