package javaStudy;

public class WhileExam {
	
	public static void main(String [] args) {
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		int total = 0;
		int j = 1;
		while(j<=100) {
			total = total + j;
			j++;
		}
		System.out.println(total);
		
		while(true) {
			System.out.println("hello");
		}
		
	}
}
