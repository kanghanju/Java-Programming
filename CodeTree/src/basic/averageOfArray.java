package basic;

import java.util.Scanner;

public class averageOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr2d = new int [2][4];

		for(int i = 0;i<2;i++){
			for(int j = 0;j<4;j++)
				arr2d[i][j] = sc.nextInt();
		}

		for(int i = 0;i<2;i++){
			double sum = 0;
			for(int j = 0;j<4;j++)
				sum += arr2d[i][j];
			System.out.printf("%.1f ",sum/4);
		}
		System.out.println();


		for(int j = 0; j<4;j++){
			double sum = 0;
			for(int i = 0; i<2;i++){
				sum += arr2d[i][j]; //여기서 많이 헷갈렸다 다시보자!!
			}
			System.out.printf("%.1f ",sum/2);
		}
		System.out.println();

		double sumA = 0;
		for(int i = 0; i<2;i++){

			for(int j = 0 ; j<4;j++){
				sumA += arr2d[i][j];
			}

		}
		System.out.printf("%.1f",sumA/8);

	}

}
