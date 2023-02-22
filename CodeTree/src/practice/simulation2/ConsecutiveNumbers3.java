package practice.simulation2;

import java.util.Scanner;

public class ConsecutiveNumbers3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int cnt = 1;
        int max = 1;
        
        for(int i = 0; i<n;i++)
            arr[i] = sc.nextInt();

        for(int i =0; i<n-1;i++){
            if(arr[i]>0 && arr[i+1]>0)
                cnt+=1;
            else if(arr[i]<0 && arr[i+1]<0)
                cnt+=1;
            else
                cnt =1;
            max = Math.max(cnt,max);
            
        }
        System.out.print(max);
	}

}
