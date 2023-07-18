package javaStudy;

public class OperatorExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 10;
		
		// 단순 대입 연산자.
		System.out.println(i == j);
		// true
		System.out.println(i != j);
		// false
		System.out.println(i < j);
		// false
		System.out.println(i <= j);
		// true
		System.out.println(i > j);
		// false
		System.out.println(i >= j);
		// true
		
		//복합 대입 연산자
		i += 10; // i = i + 10
		
		System.out.println(i);
		
		System.out.println(i -= 5);
		System.out.println(i);
		
	}

}
