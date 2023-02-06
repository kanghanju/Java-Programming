package practice.function;

import java.util.Scanner;

public class PartialContinuousSequence {



	public static boolean isPCS(int n1,int n2,int [] A,int [] B){


		for(int i=0;i<n1-n2+1;i++){
			boolean isTrue = true;
			for(int j = 0; j<n2;j++){
				if(A[i+j]!=B[j]){
					isTrue = false;
					break;
				}

			}
			if(isTrue)
				return true;
		}


		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int [] A = new int[n1];
		int [] B = new int[n2];

		for(int i = 0; i<n1;i++)
			A[i] = sc.nextInt();

		for(int i = 0; i<n2;i++)
			B[i] = sc.nextInt();

		if(isPCS(n1,n2,A,B)==true)
			System.out.print("Yes");
		else
			System.out.print("No");
	}

}
