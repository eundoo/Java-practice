package step2;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Scanner객체의 nextInt() 메소드를 이용해서 정수를 2개 입력받아서 변수에 대입하세요
		 * if문을 사용해서 변수에 대입된 두 정수 중에서 더 큰수를 화면에 출력하세요
		 */
		System.out.println("첫번째 정수를 입력하세요");
		int a = scanner.nextInt();
		
		System.out.println("두번째 정수를 입력하세요");
		int b = scanner.nextInt();
		
		if(a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
