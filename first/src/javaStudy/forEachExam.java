package javaStudy;

public class forEachExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iarray = {10,20,30,40,50};
		
		for(int i = 0; i< iarray.length; i++) {
			int value = iarray[i];
			System.out.println(value);
		}
		
		// for each 구문
		for(int value:iarray) {
			System.out.println(value);
			//10
			//20
			//30
			//40
			//50
		}
	}

}
