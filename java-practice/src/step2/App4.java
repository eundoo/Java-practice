package step2;

import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Scanner객체의 nextInt() 메소드를 이용해서 국어, 영어, 수학점수를 입력받아서 변수에 저장하세요
		 * 국어, 영어, 수학에 총점과 평균을 계산해서 변수에 저장하세요
		 * if문을 사용해서 평균을 기준으로 성적을 계산하시오.
		 * 성적은 평균이 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D, 그 외는 F로 계산해서 변수에 저장한다.
		 * 화면에 국어, 영어, 수학, 총점, 평균, 성적을 출력하시오
		 */
		System.out.println("국어점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scanner.nextInt();
		
		int total = kor+eng+math;
		int avg = total/3;
		
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println(avg);
		
		if(avg >= 90) {
			System.out.println('A');
		} else if(avg >= 80) {
			System.out.println('B');
		} else if(avg >= 70) {
			System.out.println('C');
		} else if(avg >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}

	}
}
