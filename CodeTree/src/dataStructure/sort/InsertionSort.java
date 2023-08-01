package dataStructure.sort;
import java.util.*;

public class InsertionSort {
	public static final int MAX_N = 100;

	public static int n;
	public static int[] arr = new int[MAX_N];

	public static void insertionSort() {
		for(int i = 1; i < n; i++) {
			int j = i - 1;
			int key = arr[i];
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		n = sc.nextInt();
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		insertionSort();

		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
