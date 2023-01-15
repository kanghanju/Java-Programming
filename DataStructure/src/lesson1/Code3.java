package lesson1;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		String str = "Hello,world";
		String input = null; // =null을 안써도 같은 의미다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type a string:");
		input = sc.next(); //next()함수는 사용자가 입력한 첫번째 단어만 입력을 해준다!(공백기준)
		/*String 2개가 같은지 확인할땐 (==)연산자를 쓸 수 없다!!! */
		//if(str == input)이라 작성하면 원하는 결과가 안나옴
		//두 개의 문자열이 동일한지 확인할때는 .equals()를 사용한다
		if(str.equals(input)) {
			System.out.println("Strings match!");
		}else {
			System.out.println("Strings do not match!");
			
		}
		sc.close();
	}

}
