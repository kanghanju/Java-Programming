package dataStructure.sorting;
import java.util.*;

public class HeapSort {
	static int[] arr;

    public static void heapSort(int n){

        for(int i = n/2; i>=1; i--){
            heapify(arr,n,i); //처음 max-heap을 만들어 낸다 
        }

        for(int i = n; i>1 ; i--){
            int tmp = arr[1];
            arr[1] = arr[i];
            arr[i] = tmp;
            heapify(arr,i-1,1); //교환후에는 max-heap이깨져 heapify(1)을 수행해야 한다
        }
    }

    public static void heapify(int[] arr,int n,int i){
        int curr = i;
        int left = i*2;
        int right = i*2 + 1;

        if(left<=n && arr[curr] < arr[left]){
            curr = left;
        }

        if(right<=n && arr[curr] < arr[right]){
            curr = right;
        }

        if(curr != i){
            int tmp = arr[i];
            arr[i] = arr[curr];
            arr[curr] = tmp;
            heapify(arr,n,curr);
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];

        for(int i = 1; i<n+1; i++){
            arr[i] = sc.nextInt();
        }

        heapSort(n);

        for(int i = 1; i<n+1; i++){
            System.out.print(arr[i]+" ");
        }
	}

}
