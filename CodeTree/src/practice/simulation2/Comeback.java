package practice.simulation2;

import java.util.Scanner;

public class Comeback {
	
	public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{1,0,-1,0};
    //움직이고 나서 그 자리에 숫자를 새기거나 하면 배열이 필요한데 그냥 움직이기만 하고 
    //다시 제자리에 왔는지만 확인하는 문제이기 때문에 배열이 필요없다.
    public static int curX=0,curY=0;
    public static int time=0;
    public static int ans = -1;

    public static int dirToNum(char dir){
        if (dir=='E')
            return 0;
        else if (dir=='W')
            return 2;
        else if (dir=='S')
            return 1;
        else
            return 3;
    }

    //boolean을 return하는 함수
    public static boolean move(int dis,int dirNum){
        for(int j=0;j<dis;j++){
                curX = curX+dx[dirNum];
                curY = curY+dy[dirNum];
                time++;

                if(curX==0 && curY==0){
                    ans = time;
                    return true;
                }
            }
            return false;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        for(int i = 0; i<n;i++){
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();

            int dirNum = dirToNum(dir);
            //2중for문 break알아두기
            boolean done=move(dis,dirNum);

         
            if(done) 
                break;
        }

       System.out.print(ans);
	}

}
