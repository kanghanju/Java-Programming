package practice.completeSearch1;
import java.util.Scanner;
import java.util.Arrays;

public class CandyInBasket2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n개의 바구니(위치:0~100)
        int k = sc.nextInt();//k범위
        int[] arr = new int[101];

        for(int i = 0; i < n; i++){
            int candy = sc.nextInt();
            int basketIndex = sc.nextInt();
            arr[basketIndex] += candy;
        }

        /*for(int i = 0; i<16;i++){
            System.out.print(arr[i]+" ");
        }
        */

        int max = 0;
        int c=0;
        for(int i = 0; i <= 100; i++){//바구니 0번부터 100번까지 완전탐색
            int sum = 0;
            for(int j = i-k; j <= i+k;j++){
            	if(j>=0 && j<=100)
            		sum += arr[j];
            }
            if(sum > max){
                c = i;
                max = sum;
            }
        }

        System.out.println(max);
	}

}
