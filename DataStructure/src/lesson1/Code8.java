package lesson1;
import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int [] data = new int [n];
		for(int i = 0; i<n;i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		//max의 초기값을 0으로 설정해두면 음수를 입력할때 문제가 생긴다
		int max = data[0];
		
		for(int i=0;i<n;i++) {
			sum += data[i];
			if(data[i] > max)
				max = data[i];
		}
		
		System.out.println("The sum is "+ sum);
		System.out.println("The max is "+ max);
		
		
		
	
	}

}
