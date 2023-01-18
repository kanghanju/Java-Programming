package basic;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;

		   for(int i=0; i<n;i++){
	           if(i%2==0){
	            for(int j=0;j<n;j++){
	                System.out.print(cnt);
	                cnt++;
	            }
	            cnt+=3;
	           }else{
	               for(int j =0; j<n;j++){
	                   System.out.print(cnt);
	                   cnt--;
	               }
	            cnt+=5;
	           }
	            System.out.println();
	        }
		
	}

}
