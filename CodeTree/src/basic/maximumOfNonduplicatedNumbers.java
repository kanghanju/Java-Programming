package basic;

import java.util.Scanner;

public class maximumOfNonduplicatedNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		int max = -1;


		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();

		for(int i = 0; i<n;i++){
			
			if(arr[i]>max) { //arr[i]와 max를 비교후 바로 max에 arr[i]값을 넣으면 안된다
				int cnt = 0;
				for(int j = 0;j<n;j++){
					if(arr[i]==arr[j])
						cnt++;
				}
				if(cnt ==1)
					max = arr[i]; //arr[i]가 중복이 아닐때만 갱신한다!!!
			}

		}
		System.out.print(max);
	}

}
