package lesson1;
import java.util.Scanner;
//n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장한다. 이들 중 1개 이상의 연속된 정수를 합하여
//얻을 수 있는 소수들 중에서 최대값을 구하려 출력하라
public class Code13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int [n];

		for(int i = 0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		
		int max = 0;
		for(int i = 0; i<n; i++) {
			for(int j = i ; j<n; j++) {
				
				int val = 0;
				for(int k = i; k<=j;k++) 
					val = val*10 + array[k];
				
				boolean isPrime = true;
				for(int k = 2; k<val/2 ; k++) {
					if(val % k ==0) {
						isPrime = false;
						break;
					}
				if(isPrime && val > 1 && val > max)
					max = val;	
				}
				
			}
		}
		if(max > 0)
			System.out.println(max);
		else
			System.out.println("No prime number");
	}

}
