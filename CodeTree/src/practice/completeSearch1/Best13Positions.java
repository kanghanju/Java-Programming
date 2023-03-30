package practice.completeSearch1;
import java.util.Scanner;

public class Best13Positions {
	public static int[][] arr;
	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n][n];
		int max = 0;
		int xIndex=0;
		int yIndex=0;

		for (int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();


		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-2; j++){
				int cnt = arr[i][j] + arr[i][j+1] + arr[i][j+2];

				if(cnt >= max){
					max = cnt;
					xIndex = i;
					yIndex = j;
				}

			}
		}
		
		System.out.println(xIndex+" "+yIndex);

		int max2 = 0;
		for(int i  = 0; i < n; i++){
			for(int j = 0; j < n-2; j++){
				if( (i==xIndex && j==yIndex) || (i==xIndex && j==yIndex+1) || (i==xIndex && j==yIndex+2)
					|| (i==xIndex && j==yIndex-1) || (i==xIndex && j==yIndex-2))
				{
					continue;
				}

				int cnt = arr[i][j] + arr[i][j+1] + arr[i][j+2];

				if(cnt > max2){
					max2 = cnt;
				}

			}
		}
		System.out.println(max2);

		System.out.println(max + max2);
	}

}
