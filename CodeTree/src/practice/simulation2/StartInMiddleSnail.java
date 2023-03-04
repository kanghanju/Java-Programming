package practice.simulation2;
import java.util.Scanner;

public class StartInMiddleSnail {
	
	public static int n;
    public static int[][] arr;

    public static int dirNum = 0;
    public static int x,y;

    public static int[] dx = new int[]{0,-1,0,1};
    public static int[] dy = new int[]{-1,0,1,0}; 

    public static void snail(int num){
    	x = n-1;
    	y = n-1;
    	int cnt = n*n-1;
    	
        for(int i = 0; i<n*n-1;i++){//i<n*n으로 해서 오래걸림
            int nx = x+dx[dirNum];
            int ny = y+dy[dirNum];
            if(!isRange(nx,ny)||arr[nx][ny]!=0){
                dirNum = (dirNum+1)%4;
            }
            x = x+dx[dirNum]; y = y+dy[dirNum];
            arr[x][y] = cnt;
            cnt--;
        }
    }

    public static boolean isRange(int x,int y){
        return (x>=0 && x<n)&&(y>=0 && y<n); 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n][n];
        arr[n-1][n-1]=n*n;

        snail(n*n);

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}

}
