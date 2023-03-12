package practice.completeSearch1;
import java.util.Scanner;

public class Taking_Taxi_In_Marathon {
	public static int n;
	public static int[] x;
	public static int[] y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		x = new int[n];
		y = new int[n];
		
		for(int i = 0; i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i=1;i<n-1;i++) {
			int dist = 0;
			int prevIdx = 0;
			for(int j = 1; j<n;j++) {//범위 조심
				if(i==j)continue;
				dist += Math.abs(x[prevIdx]-x[j])+Math.abs(y[prevIdx]-y[j]);
				prevIdx = j;
			}
			if(ans>dist)
				ans = dist;
		}
		
		System.out.println(ans);
	}

}
