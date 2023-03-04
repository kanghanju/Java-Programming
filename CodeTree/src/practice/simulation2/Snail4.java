package practice.simulation2;
import java.util.Scanner;
public class Snail4 {
	
	public static int n,m;
    public static char[][] arr;
    public static int x=0,y=0;
    public static int dirNum = 0;
    public static char cnt = 'B';

    public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{1,0,-1,0}; 

    public static void snail(){
        for(int i = 0; i<n*m-1;i++){
        	if(cnt=='Z'+1)
                cnt='A';
        	
            int nx = x+dx[dirNum];
            int ny = y+dy[dirNum];
            if(!isRange(nx,ny)||arr[nx][ny]!=0){
                dirNum = (dirNum+1)%4;
            }
            x = x+dx[dirNum]; y = y+dy[dirNum];
            arr[x][y] = cnt;
            cnt++;
            
        }
    }

    public static boolean isRange(int x,int y){
        return (x>=0 && x<n)&&(y>=0 && y<m); //습관적으로 y<n해서 틀림
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new char[n][m];
        arr[0][0] = 'A';

        snail();

        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}

}
