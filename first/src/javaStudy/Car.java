package javaStudy;

public class Car {
	//타입 필드명
	String name;
	int number;
	void run() {
		System.out.println("차가 달립니다.");
	}
	// void 내용은 class 안에서만 가능.
	
	public Car(String name) {
		this.name = name;
	}
	// 사용자가 생성자를 하나라도 추가했더니
	// 기본 생성자는 자동으로 만들어지지 않았더라.
	// 정확한 생성자의 정의?
	// 생성자란 객체가 생성될때 자동으로 호출되는 특수 목적의 멤버함수(메소드)로 객체의 초기화를 위해 사용됨.
	
	
	// this - 객체 자신을 참조하는 키워드
	
	public void run(int x) {
//		배개변수로 int형을 받으며 반환 값이 없는 경우 void를 사용.
		// int를 사용할경우 return을 무조건 해야하는데 반환값이 없는 경우는 오류가 나니까 void 잘 기억해둬야할거같음.
	}
}


//class Car{
//	void run() {
//		System.out.println("차가 달립니다.");
//	}
//}