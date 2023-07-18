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
		
		// 문제
		//변수 a와 b는 int형 변수입니다. 각각 어떤 값을 가지고 있는지는 비교해 보기 전에는 모릅니다.
        //a와 b가 주어져 있다고 가정하고 아래 지시에 따라 문제를 풀어 보세요.
		int a = 10, b = 7;
        //a가 b보다 큰 지 비교한 결과(true 또는 false)를 c에 저장하세요.
        boolean c = b < a;


        //a와 b가 같은지 비교한 결과를 d에 저장하세요.
        boolean d = a == b;


        //a와 b가 다른지 비교한 결과를 e에 저장하세요.
        boolean e = a != b;
		
        
	}

}
