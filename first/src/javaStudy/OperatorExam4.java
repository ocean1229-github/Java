package javaStudy;

public class OperatorExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b3);
		
		int score = 88;
		if(score <= 100 && score >= 70) {
			System.out.println("성공");
		}else {			
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		System.out.println(!b1);
	
		// 문제
		int age = 5;
	    boolean isDiscount = false;
	    // 아래 빈칸을 채워 코드를 완성하세요.
	    if(age <= 19 || age >= 60) {
	        isDiscount = true;
	    }
	    else {
	        isDiscount = false;
	    }
	    
	  //아래 빈칸을 채워 코드를 완성하세요.
	    boolean isTwenties = false;
        if(age >= 20 && age <= 29) {
            isTwenties = true;
        }
        else {
            isTwenties = false;
        }    
	    
	}
}
