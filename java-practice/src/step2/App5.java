package step2;

public class App5 {

	public static void main(String[] args) {
	
		/*
		 * for문과 if문을 사용해서 1~100까지의 정수 중에서 홀수의 합과 정수의 합을 계산해서 화면에 출력하세요
		 */
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 1) {
				continue;
			}
			total += i;
		} 
		System.out.println(total);
	}
}
