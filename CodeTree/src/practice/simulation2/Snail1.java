package practice.simulation2;
import java.util.Scanner;

public class Snail1 {
	
	public static int n,m;
    public static int[][] arr;
    public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{1,0,-1,0};
    public static int x=0,y=0,cnt=1;
    public static int dirNum = 0;

    public static boolean isRange(int x,int y){
        return (x>=0 && x<n)&&(y>=0 && y<m);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        arr[x][y] = cnt;
        
        //for루프의 범위가 헷갈렸음 i<=n으로 하면 정답은 맞는데 효울적이진 않음
        for(int i = 0; i<=n;i++){
            for(int j = 0; j<=m;j++){
                int nx = x+dx[dirNum];
                int ny = y+dy[dirNum];
                
                //이 if else문이 문제임. 이렇게 하면 계산 횟수가 모자라게 된다.
                //방향을 바꾸고 바로 arr[x][y]를 업데이트 해야하는데 for문을 한번 더 돌고 업데이트 하므로 횟수 모자란거다
                if(isRange(nx,ny)&&arr[nx][ny]==0){
                    x = nx;
                    y = ny;
                    cnt++;
                    arr[nx][ny] = cnt;
                }
                else{
                    dirNum = (dirNum+1)%4;
                }
                    
            }
        }

        for(int i = 0; i<n;i++){
            for(int j =0; j<m;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
	}

}
