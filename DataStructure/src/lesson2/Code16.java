package lesson2;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//메서드 power을 호출!한다
		int result = power(a,b);
		System.out.println(result);
		sc.close();
	}
	
	//메서드 power는 매개변수로 두개의 정수 n,m을 받고 반드시 결과를 int로 반환한다. 
	public static int power(int n, int m){
		
		int prod = 1;
		for(int i = 0; i<m; i++) 
			prod = prod*n;
		
		return prod;
	}

}
