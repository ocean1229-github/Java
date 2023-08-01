package javaStudy;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		// x
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		// x -> static
		// 모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다.
		// static이란 키워드를 사용하면 인스턴스화 하지 않아도 사용가능
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		// 클래스 변수 = static한 변수
		// 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유
		// 클래스 이름을 직접 사용하는 것이 가능
		// 클래스이름.클래스변수명
		System.out.println(VariableScopeExam.staticVal);
		
		
		// 문제
//		public class VariableScopeExam{
//		    static int value = 10;
//		    public static void main(String []args){
//		        System.out.println(value);
//		    }
//		}		
	}
}
