package practice.completeSearch2;
import java.util.Scanner;

public class DistanceBetweenTwoNearestPoints {
	
	public static int[] x = new int[100];
    public static int[] y = new int[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        int dist = 0;
        for(int i = 0; i< n ;i++){
            
            for(int j = i+1; j<n; j++){ //두점 i,j
                
                ans = Math.min(ans,(Math.abs(x[i]-x[j])*Math.abs(x[i]-x[j])) + (Math.abs(y[i]-y[j])*Math.abs(y[i]-y[j])));
                //System.out.println(dist);
            }
            //ans = Math.min(ans,dist);-> 이렇게하면 모든 두점사의 거리를 계산한 후에 최소거리 ans를 업데이트한다
            //System.out.println("ans:"+ans);
        }

        System.out.print(ans);
	}

}
