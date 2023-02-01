package basic;

import java.util.Scanner;

public class ContinueToClearString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        while(A.indexOf(B) > -1){
            int index = A.indexOf(B);
            
            A = A.substring(0,index)+A.substring(index+B.length());
            
        }
        System.out.print(A);
	}

}
