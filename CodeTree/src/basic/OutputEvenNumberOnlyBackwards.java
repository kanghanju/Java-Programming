package basic;
import java.util.Scanner;
public class OutputEvenNumberOnlyBackwards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length()-1;


        for(int i = len;i>=1;i--){
            if(i%2 != 0){
                System.out.print(str.charAt(i));
            }else{
                continue;
            }
        }
	}

}
