package lesson1;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		
		int number = 123;
		Scanner sc = new Scanner(System.in); //sc라는 이름의 스캐너를 만든다.
//	Source->Organize Imports하면 없던 import문이 생긴다!
		System.out.print("Please enter an integer:"); //줄을 바꾸지 않음
		int input = sc.nextInt();
		if(input == number) {
			System.out.println("Number match!");
		}else {
			System.out.println("Numbers do not match");
		}
		sc.close();
	}

}
