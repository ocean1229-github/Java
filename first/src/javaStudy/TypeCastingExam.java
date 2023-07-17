package javaStudy;

public class TypeCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본형의 타입변환
//		byte < short, char < int < long < float < double
		int x = 50000;
		long y = x;
		// 형변환이 일어났다.
		// 아무 일 없이 형변환이 잘 이루어 졌다면 묵시적 형변환이라고 한다.
		
		long x2 = 5;
//		int y2 = x2;
		//error발생 -> int는 5라는 값을 충분히 담을 수 있지만 long 자체가 타입이 더 크기 때문에 오류가 생긴다.
		int y2 = (int) x2;
		// 이렇게 할 경우 타입을 변경시켜 변수를 저장하기 때문에 강제적 형변환이라고 한다.
		
		// 기본형 타입 변환 - 문제(1)
		int intValue = 200;
        //빈칸에 long타입 변수 longValue를 선언하고 변수를 intValue를 이용해 초기화해보세요.
        
		long longValue = intValue;

        System.out.println(longValue);
        
        // 기본형 타입 변환 - 문제(2)
        long longValue2 = 20;
        //이 아래줄에 int형 변수 intValue2를 선언하고 longValue2에 들어있는 값을 담아보세요.
        
        int intValue2 = (int) longValue2;
        
        System.out.println(intValue2);
	}

}
