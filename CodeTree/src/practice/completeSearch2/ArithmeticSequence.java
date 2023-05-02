package practice.completeSearch2;
import java.util.Scanner;
import java.util.Arrays;

public class ArithmeticSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i = 1; i<=100 ; i++){

            int cnt = 0;

            for(int j = 0; j<n; j++){
                for(int k=j+1; k<n;k++){
                    int d1 = Math.abs(arr[j]-i);
                    int d2 = Math.abs(arr[k]-i);
                
                    if(d1 == d2){
                        cnt++;
                        //System.out.println(j+" "+k);
                    }
                    
                }
            }

            max = Math.max(cnt,max);
        }

        System.out.print(max);
	}

}
