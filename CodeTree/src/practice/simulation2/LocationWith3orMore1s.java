package practice.simulation2;

import java.util.Scanner;

public class LocationWith3orMore1s {
	public static int n;
    public static int[][] arr;

    public static int[] dx = new int[]{0,1,0,-1};
    public static  int[] dy = new int[]{1,0,-1,0};


    public static boolean inRange(int x,int y){
        return x>=0 && x<n && y>=0 && y<n;
    }

    public static int adjacentCnt(int x, int y){
        int cnt=0;
        for(int i = 0; i<4;i++){
            int nx = x+dx[i], ny = y+dy[i];
            if(inRange(nx,ny) && arr[nx][ny]==1)
                cnt++;
        }
        return cnt;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        

        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++)
                arr[i][j] = sc.nextInt();
        }

        int ans = 0;
         for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(adjacentCnt(i,j)>=3)
                    ans++;
            }
        }
        System.out.print(ans);
	}

}
