package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("");
		
		Car c2 = new Car("");
//		new 연산자는 new연산자 뒤에 나오는 생성자를 이용하여 메모리에 객체를 만들라는 명령.
//		메모리에 만들어진 객체를 인스턴스(instance)라고도 한다.
//		이렇게 만들어진 객체를 참조하는 변수가 c1 , c2 이다.
//		위의 코드가 실행되면 Car라는 객체가 2개가 만들어지고 각각의 객체를 참조하는 c1과 c2변수가 선언됩니다.
	
		//객체별로 name 과 number가짐
		c1.name = "소나타";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		
		Car car = new Car("");
		new Car("");
		car.run();
	}

}
