package step3;

public class App7 {

	public static void main(String[] args) {
		int[] numbers = {10, 5, 23, 9, 17, 2, 20};
		
		/*
		 * 배열객체에 저장된 정수중에서 가장 큰 수를 찾아서 화면에 출력하시오.
		 */
	
		int max = numbers[0];
		
		for(int i = 1 ; i < numbers.length ; i++) {
			if(numbers[i] >= max) {
				max = numbers[i];
			}
			
			System.out.println(max);
		}
	}	
}
