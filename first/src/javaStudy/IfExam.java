package javaStudy;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		int y = 50;
		
		if(x < y) {
			System.out.println("x는 y보다 작습니다.");
			System.out.println("test");
		}
		if(x < y)
			System.out.println("x는 y와 같습니다.");
		System.out.println("test");
		
		if(x==y) {
			System.out.println("x는 y와 같습니다.");
		}else if(x!=y){
			System.out.println("x와 y는 다릅니다.");
		}else {
			System.out.println("오류?");
		}
		
		
		//문제
		int value = 6;
		if(value % 3 == 0) {
			System.out.println("value는 3의 배수입니다.");
		}
		
		// 문제2
		// 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
        else if(value % 4 == 0){
            ret = 4;
        }

	}

}
