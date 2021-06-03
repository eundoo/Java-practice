package step4;

public class App2 {

	public static void main(String[] args) {
		/*
		 * StudentScore객체를 생성하시오.
		 * 생성된 객체의 멤버변수에 이름, 국어점수, 영어점수, 수학점수를 대입하세요
		 * 생성된 객체의 멤버변수에 저장된 값을 화면에 출력하시오.
		 * 생성된 객체의 국어, 영어, 수학점수로 총점, 평균을 계산해서 변수에 대입하세요
		 * 
		 * 화면에 학생이름, 국어점수, 영어점수, 수학점수, 총점, 평균을 출력하시오
		 */
	
		StudentScore scores = new StudentScore();
		
		scores.name = "오나나";
		scores.kor = 100;
		scores.eng = 100;
		scores.math = 100;
		
		System.out.println(scores.name);
		System.out.println(scores.kor);
		System.out.println(scores.eng);
		System.out.println(scores.math);
		
		int total = (scores.kor + scores.eng + scores.math);
		int avg = total/3;
		
		System.out.println(scores.name);
		System.out.println(scores.kor);
		System.out.println(scores.eng);
		System.out.println(scores.math);
		System.out.println(total);
		System.out.println(avg);
		
		
		
		
	}
}
