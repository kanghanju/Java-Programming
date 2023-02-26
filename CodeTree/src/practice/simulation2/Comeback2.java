package practice.simulation2;

import java.util.Scanner;

public class Comeback2 {
	
	//E,S,W,N(여기서 오래걸림)
    public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{1,0,-1,0};
    public static int x=0,y=0;
    public static int time=0;
    public static int ans = -1;
    public static int dirNum = 3;

    public static int Order(char order){
        if (order=='F'){
            return move();
        }
        else if (order=='R'){
            dirNum = (dirNum+1)%4;
            time++;
             return 0;
        }
        else{
            dirNum = (dirNum+3)%4;
            time++;
             return 0;
        } 
    }

    public static int move(){
        x = x+dx[dirNum];
        y = y+dy[dirNum];
        time++;

        if(x==0 && y==0){
            ans = time;
            return 1;
        }
            
        return 0;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
        String str = sc.next();    

        for(int i = 0; i<str.length();i++){
            char order = str.charAt(i);

            int done=Order(order);
            //System.out.println("x:"+x+" y:"+y);

            if(done==1) 
                break;
        }

       System.out.print(ans);
	}

}
