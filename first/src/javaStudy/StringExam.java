package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String 클래스 - 문자열 표현하는 자바에서 가장 많이 사용하는 클래스
		// new 연산자를 이용하지 안히고 인스턴스를 만들 수 있다.
		String str1 = "hello";
		String str2 = "hello";
		//위 두개는 같은 곳을 가르키고 있다.
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2) {
			System.out.println("str1 과 str2 는 같은 레퍼런스입니다.");
		}
		
		if(str1 == str3) {
			System.out.println("str1 과 str3 는 같은 레퍼런스입니다.");			
			// 다른 부분임
		}
		
		if(str3 == str4)
			System.out.println("str3 과 str4 는 같은 레퍼런스입니다.");			
			
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
	
	
		// 문제
//		String str1 = new String("Hello world");
//        String str2 = new String("Hello world");
//        
//        if( str1.equals(str2) ){
//            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
//        }
//        else{
//            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
//        }
		// str1과 str2는 같은 값을 가지고 있습니다.ㅌ
		
	
	}

	
	
}
