package algorithmLow.simulation;
import java.util.*;

public class MoveToAdjacentPlaceWithLargeNumber {
	static int n;
    static int[][] arr;
    static int[] dx = {-1,1,0,0};//북남서동
    static int[] dy = {0,0,-1,1};

    public static void move(int r,int c){
        int curX = r;
        int curY = c;
        int xPos=r,yPos=c;

        while(true){
            System.out.print(arr[xPos][yPos]+" ");
            boolean isTrue = false;

            for(int i=0; i<4; i++){
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                if(!inRange(nextX,nextY))continue;

                int num = arr[nextX][nextY];

                if(num>arr[curX][curY]){
                    isTrue = true;
                    xPos = nextX;
                    yPos = nextY;
                    break;
                }
            }
            if(!isTrue)break;
            curX = xPos;
            curY = yPos;
        }
    }

    public static boolean inRange(int x,int y){
        return (x>=0 && x<n && y>=0 && y<n);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;

        for(int i=0; i<n; i++)
            for(int j=0; j<n;j++)
                arr[i][j] = sc.nextInt();

        
        move(r,c);
	}

}
