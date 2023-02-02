package basic;

import java.util.Scanner;

public class RemoveAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		String num1=""; //변수를 선언만하고 값을 넣어주지 않아 계속 에러가 떴다. String변수에 ""값을 지정해주자!(초기화)
		String num2="";



		for(int i = 0; i<str1.length();i++){
			if(str1.charAt(i)>='0' && str1.charAt(i)<='9'){
				num1 += str1.substring(i,i+1);

			}else
				continue;
		}
		

		for(int i = 0; i<str2.length();i++){
			if(str2.charAt(i)>='0' && str2.charAt(i)<='9'){
				num2 += str2.substring(i,i+1);
			}else
				continue;
		}

		System.out.print(Integer.parseInt(num1)+Integer.parseInt(num2));
	}

}
