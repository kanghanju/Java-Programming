package lesson1;

import java.util.Scanner;

public class Code18_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int [n];
		for(int i = 0; i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		bubbleSort(array);

		System.out.println("Sorted data:");
		for(int i = 0; i<n;i++)
			System.out.print(array[i]+" ");
	}
	static void bubbleSort(int [] array){

		for(int i = 0; i<array.length-1;i++) {
			for(int j = 0; j < array.length-1-i;j++) {
				if(array[j] > array[j+1]) 
					swap(array[j],array[j+1]); //actual parameter

			}
		}
	}
	//값에 의한 호출(call by value): actual parameter와 formal parammeter는 
	//별개의 변수다!(메모리에서 전혀 다른 위치를 차지함)
	static void swap(int a, int b) {//formal parameter
		int tmp = a;
		a = b;
		b = tmp;
	}
	//a,b의 값이 swap 된거지 array[j],array[j+1]의 값이 swap된게 아니다!
	//즉 a,b라는 복사본만 swap을 실행하였다
}
