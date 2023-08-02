package javaStudy;

public class Car {
	//타입 필드명
	String name;
	int number;
	void run() {
		System.out.println("차가 달립니다.");
	}
	// void 내용은 class 안에서만 가능.
	
	public Car(String n) {
		name = n;
	}
	// 사용자가 생성자를 하나라도 추가했더니
	// 기본 생성자는 자동으로 만들어지지 않았더라.
}


//class Car{
//	void run() {
//		System.out.println("차가 달립니다.");
//	}
//}