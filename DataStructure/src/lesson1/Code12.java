package lesson1;

import java.util.Scanner;

//n개의 정수를 입력받아 배열에 저장한다. 이들 중에서 -개 이상의 연속된 정수들을 더하여 얻을 수 
//있는 최대값을 구하여 출력하는 프로그램을 작성해라 
public class Code12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int [n];

		for(int i = 0;i<n;i++) {
			array[i] = sc.nextInt();
		}

		int maxSum = 0;
		for(int i=0; i<n;i++) {
			for(int j=i; j<n;j++) {

				int sum = 0;
				
				for(int k = i;k<=j ; k++)
					sum += array[k];	
				
				if(sum > maxSum) 
					maxSum = sum;		
			}
		}
		System.out.println(maxSum);
		
	/*	int max = 0;
		for (int i = 0; i<n ; i++) {
			int sum = 0;
			for(int j = i ; j<n ; j++) {
				sum += array[j];
				if(sum > max)
					max = sum;
			}
		}*/
	}

}
