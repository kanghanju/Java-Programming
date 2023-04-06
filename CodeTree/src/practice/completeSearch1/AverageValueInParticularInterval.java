package practice.completeSearch1;

import java.util.Scanner;

public class AverageValueInParticularInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i<n;i++){
            for(int j = i; j<n;j++){
                int sum = 0;
                for(int k = i; k<= j;k++){
                    sum += arr[k];
                }
                
                double avg = (double)sum/(j-i+1);
                //System.out.println(avg);
                
                for(int k = i; k<=j; k++){
                    if(avg == arr[k]){
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);

	}

}
