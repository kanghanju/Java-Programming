package practice.function;

import java.util.Scanner;

public class FindingLocationSubstringUsingFunction {


	public static String inputStr,objStr;

	public static boolean isPart(int startIdx){
		int n = inputStr.length();
		int m = objStr.length();

		if(startIdx + m -1 >= n)
			return false;
		for(int j = 0; j<m;j++){
			if(inputStr.charAt(startIdx+j)!= objStr.charAt(j))
				return false;
		}
		return true;
	}
	public static int findIndex(){
		int n = inputStr.length();
		for(int i = 0; i<n;i++){
			if(isPart(i))
				return i;
		}
		return -1;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		inputStr = sc.next();
		objStr = sc.next();
		System.out.print(findIndex());


	}

}
