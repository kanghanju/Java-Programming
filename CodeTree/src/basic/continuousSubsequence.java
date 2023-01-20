package basic;
import java.util.Scanner;

public class continuousSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();


		int [] A = new int [100];
		int [] B = new int [100];

		for(int i = 0; i<n1;i++)
			A[i] = sc.nextInt();

		for(int i = 0; i<n2;i++)
			B[i] = sc.nextInt();


		for(int i=0; i<n1; i++){

			boolean result = true;

			for(int j = 0; j<n2;j++){

				if(i+j>=n1){
					result = false;
					break;
				}

				if(A[i+j]!=B[j]){
					result = false;
					break;
				}

			}
			if(result) {
				System.out.print("Yes");
				System.exit(0);
			}
		}

		System.out.print("No");

	}

}
