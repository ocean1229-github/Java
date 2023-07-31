package javaStudy;

public class StringMethodExam {
	public static void main(String[] args) {
		String str = "hello";
		// 공백도 하나의 문자
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		// str -> hello 를 가르키고있음
		// str을 concat으로 추가해도 str은 결국 hello를 가르킴
		// str을 concat으로 추가한 문장을 가르키고싶으면 밑에처럼 해야함.
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
	}
}
