package step4;

public class App1 {

	public static void main(String[] args) {
		/*
		 * StudentScore객체를 생성하세요.
		 * 생성된 객체의 멤버변수에 학생이름, 국어점수, 영어점수, 수학점수를 대입하세요
		 * 생성된 객체의 멤버변수에 저장된 값들을 화면에 출력하시오
		 */
		
		StudentScore scores = new StudentScore();

		scores.kor = 100;
		scores.eng = 100;
		scores.math = 100;
		
		System.out.println(scores.kor);
		System.out.println(scores.eng);
		System.out.println(scores.math);
	}
}
