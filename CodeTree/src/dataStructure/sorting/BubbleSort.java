package dataStructure.sorting;
import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr,int n) {
		boolean sorted = true;
		
		do {
			sorted = true;
			for(int i = 0; i<n-1; i++) {//n번비교 
				if(arr[i]>arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					sorted = false;
				}
			}
					
		}while(!sorted);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr,n);
		
		for(int num:arr){
            System.out.print(num+" ");
        }

	}

}
