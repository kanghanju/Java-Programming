package practice.simulation2;

import java.util.Scanner;

public class Snail2 {

	public static int n,m;
	public static int[][] arr;
	public static int[] dx = new int[]{0,1,0,-1};
	public static int[] dy = new int[]{1,0,-1,0};
	public static int x=0,y=0;
	public static int dirNum = 0;

	public static boolean isRange(int x,int y){
		return (x>=0 && x<n)&&(y>=0 && y<m);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		arr[x][y] = 1;
		
		
		for(int i = 2; i<=n*m;i++){

			int nx = x+dx[dirNum];
			int ny = y+dy[dirNum];
			
			//Snail1코드와 비교하면 Snail2코드의 if-else문은 잘쓴거다
			if(!isRange(nx,ny)||arr[nx][ny]!=0)
				dirNum  = (dirNum+1)%4;
			
			//x = nx로 하면 dirNum이 업데이트가 되지않으므로 error발생
			x = x+dx[dirNum]; y = y+dy[dirNum];
			arr[x][y] = i;

		}


		for(int i = 0; i<n;i++){
			for(int j =0; j<m;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}



	}

}
