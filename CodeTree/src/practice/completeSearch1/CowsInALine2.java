package practice.completeSearch1;
import java.util.Scanner;

public class CowsInALine2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i =0; i<n;i++)
            arr[i] = sc.nextInt();

        for(int j = 1; j<n-1;j++){
            int leftCount = 0, rightCount = 0;
            for(int i=0;i<j;i++){
                if(arr[i]<=arr[j])
                    leftCount++;
            }
            for(int k=j+1;k<n;k++){
                if(arr[j]<=arr[k])
                    rightCount++;
            }
            cnt += leftCount * rightCount;
        }
        System.out.println(cnt);
	}

}
