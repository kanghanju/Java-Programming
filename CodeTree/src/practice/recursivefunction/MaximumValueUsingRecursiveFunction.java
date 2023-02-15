package practice.recursivefunction;

import java.util.Scanner;

public class MaximumValueUsingRecursiveFunction {
	
	public static int[] arr = new int[100];
	
	public static int max(int index) {
		if(index==0)
			return arr[0];
		
		return Math.max(max(index-1), arr[index]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.print(max(n-1));
		
	}

}
