package basic;

import java.util.Scanner;

public class AddIntegersOnly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int sum = 0;
        
        //'2'와 2는 엄연히 다르다!!
        //(int)'2'와 2의 값이 똑같은줄알았다....
        //(int)'2'는 50이다 !!!
        
        for(int i = 0; i<A.length();i++){
            if(A.charAt(i)>='0' && A.charAt(i)<='9')
                sum += (A.charAt(i)-'0'); //이 부분도 주의!
        }
        System.out.println(sum);
	}

}
