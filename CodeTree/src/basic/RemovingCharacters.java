package basic;

import java.util.Scanner;

public class RemovingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int len = str.length();

        while(len != 1){
            int del = sc.nextInt();
            if(del >= len){ //입력받은 수가 문자열의 길이를 넘는 특수경우를 if문에 넣는다
                del = len-1;
            }
            str = str.substring(0,del)+str.substring(del+1);
            System.out.println(str);
            len = str.length();
        }

	}

}
