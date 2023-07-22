package javaStudy;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;
				//continue를 만나면 바로 반복 끝. 다시 위로
				// 즉 결과가 짝수의 합으로 나옴.
			}
			total = total + i;
			if(i == 50) {
				break;
				// break를 만난 시점부터 반복문 종료
			}
		}
		
		System.out.println(total);
		
		// 문제
		//for문을 이용해서 1부터 100까지 숫자 중 짝수만 출력해 보세요
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
	}

}
