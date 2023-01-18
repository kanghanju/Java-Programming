package lesson1;

import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		//bubblesort(버블정렬) 알고리즘: 가장 큰 값을 찾아 맨 마지막 자리로 옮긴다
		//그러면 가장 큰 값은 어떻게 찾아 낼거고 어떻게 맨 뒷자리로 옮길까?
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int [n];

		for(int i = 0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		
		 /*for(int i = n-1 ; i>0 ; i--) {
			for(int j = 0; j<i ; j++) {
				if(array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}*/
		
		for(int i = 0; i<n-1;i++) {
			for(int j = 0; j<n-1-i ; j++) {
				if(array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		
		
		System.out.println("Sorted data:");
		for(int i = 0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
