package practice.simulation2;

import java.util.Scanner;

public class KeepTheLead2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] A = new double[1000001];
        double[] B = new double[1000001];
        int curA = 1;
        int curB = 1;

        for(int i = 0; i<n;i++){
            int v = sc.nextInt();
            int h = sc.nextInt();
            double disPerHour = (v*h)/h;
            
            for(int j=curA; j<curA+h;j++) {
            	A[j] = A[j-1]+disPerHour;
            	//System.out.println(A[j]);
            }
            curA = curA+h;
          
            
        }


        for(int i = 0; i<m;i++){
            int v = sc.nextInt();
            int h = sc.nextInt();
            double disPerHour = (v*h)/h;
            
            for(int j=curB; j<curB+h;j++) {
            	B[j] = B[j-1]+disPerHour;
            	//System.out.println(B[j]);
            }
            curB = curB+h;
           
        }

        
        char[] head = new char[1000001];
        int cnt = 0;
        char max;

        for(int i = 1; i<curA;i++){
            max = A[i] > B[i]? 'A':'B';
            head[i] = max;
      
        }
        for(int i =1; i<curA-1;i++){
            if(head[i] != head[i+1]) {
                cnt++;
            }
        }
        System.out.print(cnt);
	}

}
