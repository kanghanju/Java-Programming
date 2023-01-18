package lesson2;

import java.util.Scanner;

public class Code18 {
//사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정렬하여 출력하는 코드
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
				if(array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1]= tmp;
				}
			}
		}
	}
}
