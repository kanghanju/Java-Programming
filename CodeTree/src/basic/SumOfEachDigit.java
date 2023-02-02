package basic;

import java.util.Scanner;

public class SumOfEachDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = Integer.toString(n);
        int sum = 0;

        for(int i = 0; i<str.length();i++){
            sum += Integer.parseInt(str.substring(i,i+1)); //문자열을 숫자로 바꿔 더한다. 
            //str.charAt(i) - '0' 아이디어도 있음!!
        }
        System.out.print(sum);
	}

}
