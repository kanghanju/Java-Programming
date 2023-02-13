package practice.function;

import java.util.Scanner;

public class IsPalindrome {
	
	 public static boolean palindrome(String str){

	        for(int i=0; i<str.length();i++){
	            if(str.charAt(i)!=str.charAt(str.length()-1-i)) //이 for문을 생각못했다.문자열 관련함수 복습하기!
	                return false;
	        }

	        return true;
	    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String A = sc.next();

      
        if(palindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");
		
	}

}
