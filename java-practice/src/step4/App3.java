package step4;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * StudentScore객체를 생성하시오.
		 * Scanner객체의 next(), nextInt() 메소드를 이용해서 학생이름과 국어,영어,수학점수를 입력받아서 생성된 객체의 멤버변수에 대입하세요.
		 * 생성된 객체의 멤버변수에 저장된 값을 화면에 출력하세요
		 */
		
		StudentScore scores = new StudentScore();

		System.out.println("국어점수를 입력하세요");
		scores.kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		scores.eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		scores.math = scanner.nextInt();
		
		System.out.println(scores.kor);
		System.out.println(scores.eng);
		System.out.println(scores.math);
	}
}
