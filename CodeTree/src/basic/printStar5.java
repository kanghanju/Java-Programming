package basic;
import java.util.Scanner;
public class printStar5 {
	//어디에 print(" ")와 println()을 적을지 생각해보자.난이도가 낮아진다!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i>0 ; i--){//row
            for(int j=i ; j>0; j--){
                for(int k=i;k>0;k--){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(); 
        }
	}

}
