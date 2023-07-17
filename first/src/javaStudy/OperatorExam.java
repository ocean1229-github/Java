package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = -5;
		int i2 = +i1;
		int i3 = -5;
		
		System.out.println(i1);
		//-5
		System.out.println(i2);
		//-5
		System.out.println(i3);
		//5
		
		int i4 = ++i3; // i3 = i3 + 1;
		System.out.println(i4);
		//6
		System.out.println(i3);
		//6
		int i5 = i3++; // i3 = i3 + 1;
		System.out.println(i5);
		//6
		System.out.println(i3);
		//7
	
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		//7
		System.out.println(i - j);
		//3
		System.out.println(i * j);
		//10
		System.out.println(i / (double)j); //캐스팅 연산이라고 함.
		//2(몫만 나옴)
		//캐스팅 연산시 2.5라고 나옴.
		System.out.println(i % j);
		
	}

}
