package javaStudy;

public class MyClass2 {
//	메소드 오버로딩
//	매개변수의 수, 타입이 다른 경우
//	동일한 이름으로 메소드를 여러개 정의 할 수 있다.
	public int plus (int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x,String y) {
		return x + y;
	}
	
	// 똑같이 메소드 이름을 작성하는 것을
	// 메소드 오버로딩이라고 한다.
	
//	public int plus(int i, int j) {
//		
//	}
}
