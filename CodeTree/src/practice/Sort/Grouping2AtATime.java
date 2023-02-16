package practice.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Grouping2AtATime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [2*n];

        for(int i = 0; i< 2*n;i++)
            arr[i] = sc.nextInt();
        
        
        //규칙을 찾자 . 어떻게 그룹을 짜야 최대값중 최소값이 될까?
        Arrays.sort(arr);

        int max = 0;
        for(int i = 0; i<n;i++){
            int sum =arr[i]+arr[2*n-i-1];
            if(sum > max)
                max = sum;
        }
        System.out.print(max);
	}

}
