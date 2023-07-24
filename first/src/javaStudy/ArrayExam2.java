package javaStudy;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array4 = new int [3][4];
		array4[0][1] = 10;
		
		
		int[][] array5 = new int[3][];
		//	0
		//	0
		//	0
		// 위 처럼 가로가 안생김.
		
		array5[0] = new int[1];
		array5[0][0] = 10;
		
		int[][] array6 = {{1}, {1,2}, {1,2,3}};
		
		System.out.println(array6[0][0]);
		
		System.out.println(array6[2][2]);
	}

}
