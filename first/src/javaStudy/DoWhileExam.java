package javaStudy;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			// 반복할 문장들 *무조건 한 번은 실행 됨.
			value = scan.nextInt();
			System.out.println("입력받은 값 : " + value);
			
		}while(value != 10);
		
		System.out.println("반복은 종료!!");
	}

}
