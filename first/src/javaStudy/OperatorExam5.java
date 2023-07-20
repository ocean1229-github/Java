package javaStudy;
import java.util.Calendar;

public class OperatorExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1 = (5 < 4) ? 50 : 40;
		// 만약 조건 값이 참이면 첫 번째 값을
		// 조건 값이 불이면 두 번째 값을 넣어주세요.
		
		System.out.println(b1);
		//40
		
		int b2 =0;
		if(5>4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		
		System.out.println(b2);
		
		// 문제
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항연산자를 이용해서 ampm의 값을 "오전" 또는 "오후"로 만들어보세요.
        ampm = 
hour < 12 ? "오전" : "오후";

        System.out.println("지금시간은 " + hour + "시이고, " + ampm + "입니다.");
		
	}

}
