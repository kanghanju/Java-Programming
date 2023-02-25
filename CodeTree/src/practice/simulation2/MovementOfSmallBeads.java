package practice.simulation2;

import java.util.Scanner;

public class MovementOfSmallBeads {
	public static int n,t;
    public static int[][] arr;

    //dx,dy{R,D,U,L}
    public static int[] dx = new int[]{0,1,-1,0};
    public static int[] dy = new int[]{1,0,0,-1};

    public static int getDirNum(char dir){
        if(dir=='L'){
            return 3;
        }
        else if(dir=='R'){
            return 0;
        }
        else if(dir=='U'){
            return 2;
        }
        else{
            return 1;
        }
    }

    public static boolean inRange(int x, int y){
        return x>=0 && x<n && y>=0 && y<n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        arr = new int[n][n];

        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        char dir = sc.next().charAt(0);
        int direction = getDirNum(dir);

        while(t>0){
            int nx = x+dx[direction];
            int ny = y+dy[direction];
            if(!inRange(nx,ny)){
                direction = 3-direction;
                t--;
            }else{
                x = x+dx[direction];
                y = y+dy[direction];
                t--;
            }
        }

        System.out.print((x+1)+" "+(y+1));
	}

}
