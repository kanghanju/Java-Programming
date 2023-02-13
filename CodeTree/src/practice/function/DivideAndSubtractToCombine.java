package practice.function;

import java.util.Scanner;

public class DivideAndSubtractToCombine {
	


    public static int program(int n,int m,int [] A){
        int sum = 0;

        while(m!=1){
        	 sum += A[m-1];
            if(m%2==1)
                m--;
            else{
               
                m = m/2;
            }
        }

        return sum+A[0];
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i<n;i++)
            A[i] = sc.nextInt();

        System.out.print(program(n,m,A));

	}

}
