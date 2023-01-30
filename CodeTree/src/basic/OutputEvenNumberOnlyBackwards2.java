package basic;

import java.util.Scanner;

public class OutputEvenNumberOnlyBackwards2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] arr = new char[str.length()];

        
        for(int i = 0; i<str.length();i++) {//문자열의 길이는 .length()를 이용하고 배열의 길이는 length를 이용한다
        	arr[i] = str.charAt(i);
        }
        
        
        if((arr.length)%2!=0) {
        	for(int i=arr.length-2;i>=1;i-=2 ) {
            	System.out.print(arr[i]);
            }
        }else {
        	for(int i=arr.length-1;i>=1;i-=2 ) {
            	System.out.print(arr[i]);
            }
        }
        
	}

}
