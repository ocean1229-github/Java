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
	
	// this - 객체 자신을 참조하는 키워드
	
	
}


//class Car{
//	void run() {
//		System.out.println("차가 달립니다.");
//	}
//}