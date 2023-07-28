package javaStudy;

public class MyClass {
	//public 리턴타입 메소드명(매개변수 들) { 기능 구현 }
	public void method1() {
		System.out.println("메소드1이 실행됨...");
		// 매개변수도 없고 리턴 타입도 없음.
		}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 메소드2.");
		// 매개변수는 있음 리턴 타입도 없음.
	}
	
	public int method3() {
		System.out.println("메소드3 실행");
		return 10;
		// 매개변수는 없으나 리턴은 있음.
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y + "메소드4 실행");
		// 매개 변수가 2개존재 리턴값은 없음.
	}
	
	public int method5(int y) {
		System.out.println("y" + "이용한 메소드5 실행");
		return y * 2;
		// 매개변수 1개 리턴값 1개 존재.
	}
	// 위와같이 메소드의 경우 5가지의 대표적인 형태가 있음.
}
