package practice.function;

import java.util.Scanner;

public class SumOfSpecificIntervals {
	public static int n,m;
	public static int [] A;

	public static void pro(int a1,int a2){

		int sum = 0;
		for(int i = a1; i<=a2;i++)
			sum += A[i-1];
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		A =   new int [n];
		for(int i = 0; i<n;i++)
			A[i] = sc.nextInt();

		for(int i = 0; i<m;i++){
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			pro(a1,a2);
		}

	}
}
