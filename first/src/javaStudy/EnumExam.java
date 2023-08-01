package javaStudy;

public class EnumExam {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy";
		// x
		
	}

}
enum Gender{//특정 값만 가져다가 사용해야하면 열거형 사용
	MALE, FEMALE;
}