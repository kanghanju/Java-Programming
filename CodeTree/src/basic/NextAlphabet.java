package basic;

import java.util.Scanner;

public class NextAlphabet {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        char ch = sc.next().charAt(0);

	        if(ch>='a' && ch<='y'){
	            
	            System.out.print((char)(ch+1)); //암묵적 형변환: 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용된다
	        }
	        else
	            System.out.print('a');
	}

}
