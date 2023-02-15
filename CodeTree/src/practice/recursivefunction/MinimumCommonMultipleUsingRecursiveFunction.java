package practice.recursivefunction;

import java.util.Scanner;

public class MinimumCommonMultipleUsingRecursiveFunction {
	public static int n;
	public static int[] arr;
	
	public static int lcm(int sIdx) {
		if(sIdx==arr.length-1)
			return arr[arr.length-1];
		
		int a= arr[sIdx];
		int b = arr[sIdx+1];
		
		int lcmVal = (a*b)/gcd(a,b);
		arr[sIdx+1] = lcmVal;
		
		return lcm(sIdx+1);
		
	}
	
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		
		if(a>b) {
			int r = a%b;
			return gcd(b,r);
		}
		else {
			int r = b%a;
			return gcd(a,r);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0; i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.print(lcm(0));
		
		
	}

}
