package practice.simulation1;

import java.util.Scanner;

public class MaximumOverlappingIntervals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];

        for(int i = 0; i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j = a+100; j<b+100;j++)
                arr[j] += 1;
            
        }
        int max =0;

        for(int i = 0; i<201;i++){
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.print(max);
	}

}
