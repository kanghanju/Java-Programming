package basic;

import java.util.Scanner;

public class ExtractIntegersOnly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();

		int i = 0,j=0;
		while(str1.charAt(i)>='0' && str1.charAt(i)<='9'){
			i++;
			if(i == str1.length())
				break;
		}

		String num1 = str1.substring(0,i);



		while(str2.charAt(j)>='0' && str2.charAt(j)<='9'){
			j++;
			if(j == str2.length())
				break;
		}

		String num2 = str2.substring(0,j);

		System.out.print(Integer.parseInt(num1)+Integer.parseInt(num2));
	}

}
