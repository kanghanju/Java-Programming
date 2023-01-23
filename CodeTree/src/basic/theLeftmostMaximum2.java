package basic;

import java.util.Scanner;

public class theLeftmostMaximum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [1000];
        int [] maxIdx = new int [1000];

        for(int i = 0; i<n;i++)
            arr[i] = sc.nextInt();
        
        int maxVal = arr[0];
        int cnt = 0;
        maxIdx[cnt] = 0; //처음 원소(index=0)는 무조건 출력됨
        cnt++;
        
        for(int i = 1; i<n;i++) {
        	if(arr[i]>maxVal) {
        		maxVal = arr[i];
        		maxIdx[cnt] = i;
        		cnt++;
        	}
        }
       
        for(int i = cnt-1; i>=0;i--) {
        	System.out.print(maxIdx[i]+1+" ");
        }
        
	}

}
