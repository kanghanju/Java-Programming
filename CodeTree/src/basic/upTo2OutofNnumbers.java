package basic;

import java.util.Scanner;

public class upTo2OutofNnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        
        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j<n;j++){
                if(arr[i] < arr[j] ){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                    
            }
          
        }
        System.out.print(arr[0]+" "+arr[1]);
        //위가 나의 코드. 정렬도 좋지만 그냥 가장큰 원소 max1과 그다음 큰 원소 max2만 구할수도 있다
	}

}
