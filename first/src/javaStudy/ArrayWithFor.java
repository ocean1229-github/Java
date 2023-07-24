package javaStudy;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
//			System.out.println(iarray.length);
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		
		}
		
		int sum = 0;
		for(int i = 0; i< iarray.length; i++) {
			//변수의 Scope (i는 for문에 생성되었다가 for문이 끝나면 없어진다)
			sum = sum + iarray[i];
			
		}
		
		System.out.println(sum);
		
		// 문제
		// array에 순서대로 1부터 100까지 정수를 넣어보세요.
//        for(int i = 0; i<100; i++){
//            array[i] = i + 1;
//        }
		
	}

}
