// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		
		Scanner s = new Scanner(System.in);
		num1 = s.nextDouble();
		num2 = s.nextDouble();

		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
    }

}
