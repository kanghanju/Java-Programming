package practice.simulation2;

import java.util.Scanner;

public class ConsecutiveNumbers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 1;
        int max = 0;

        for(int i =0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(int i = 0; i<n-1;i++){
            if(arr[i] != arr[i+1])
                cnt = 1;
            else
                cnt++;
            max = Math.max(cnt,max);
            
        }
        System.out.print(max);
	}

}
