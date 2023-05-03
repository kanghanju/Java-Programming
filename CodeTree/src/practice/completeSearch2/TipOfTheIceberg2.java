package practice.completeSearch2;
import java.util.Scanner;

public class TipOfTheIceberg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int maxVal = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            maxVal = Math.max(maxVal,arr[i]);
        }

        int max = 0;
        for(int i = 1; i <= maxVal; i++){//해수면의 높이 설정
            
            int cnt = 0;
        
            if(arr[0] > i)
                cnt++;
            
            for(int j = 1; j<n; j++){
                if(arr[j]>i && arr[j-1] <= i){
                    cnt++;
                }
            }

            max = Math.max(cnt,max);
            
        }


        System.out.print(max);
	}

}
