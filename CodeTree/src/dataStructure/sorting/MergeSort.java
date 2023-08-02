package dataStructure.sorting;
import java.util.*;

public class MergeSort {
	static int n;
    static int[] arr;
    static int[] sorted;

    public static void mergeSort(int[] arr,int low,int high){ //분할
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int[] arr,int low,int mid,int high){//병합
        int i = low;
        int j = mid+1;

        int index = low;
        while(i<=mid && j<=high){
            if(arr[i] < arr[j]){
                sorted[index++] = arr[i];
                i++;
            }else{
                sorted[index++] = arr[j];
                j++;
            }
        }

        while(i<=mid){
            sorted[index++]=arr[i++];
        }

        while(j<=high){
            sorted[index++]=arr[j++];
        }

        for(int k = low; k<=high; k++){
            arr[k] = sorted[k];
        }
        
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        sorted = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr,0,n-1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
	}

}
