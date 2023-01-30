package basic;
import java.util.Scanner;

public class RunLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        String encoded ="";

        char curChar = A.charAt(0);
        int num = 1;
        for(int i = 1;i<A.length();i++){
            if(A.charAt(i) == curChar){//첫번째값과 현재의 값을 계속 비교해도 된다
                num++;
            }else{
                encoded += curChar;
                encoded += Integer.toString(num);

                curChar = A.charAt(i);
                num = 1;
            }
        }
         encoded += curChar;
        encoded += Integer.toString(num);

        System.out.println(encoded.length());
        System.out.println(encoded);
	}

}
