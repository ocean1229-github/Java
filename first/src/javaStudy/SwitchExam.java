package javaStudy;
import java.util.Calendar;
public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch, case, default, break
		
		int value = 1;
		
		switch(value) {
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
			case 3:
				System.out.println("3");
			default :
				System.out.println("그 외 다른 숫자");
		}
		String str = "A";
		switch(str) {
		case "A":
			System.out.println("A");
			break;
		case "B":
		}
		
		//문제
		
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
        switch(month){
            case 1:
                season = "겨울";
                break;
            case 2:
                season = "겨울";
                break;
            case 3:
                season = "봄";
                break;
            case 4:
                season = "봄";
                break;
            case 5:
                season = "봄";
                break;
            case 6:
                season = "여름";
                break;
            case 7:
                season = "여름";
                break;
            case 8:
                season = "여름";
                break;
            case 9:
                season = "가을";
                break;
            case 10:
                season = "가을";
                break;
            case 11:
                season = "가을";
                break;
            case 12:
                season = "겨울";
                break;               
                
            
        }
        
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
		
	}

}
