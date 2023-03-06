package practice.simulation2;
import java.util.Scanner;

public class AddAllNumbersOnThePath {
	public static int n,t;
	public static int[][] arr;
	public static String order;
	public static int[] dx = new int[]{0,1,0,-1};//E S W N
	public static int[] dy = new int[]{1,0,-1,0};
	public static int x,y;
	public static int dirNum=3;
	public static int sum = 0;

	public static boolean isRange(int x,int y){
		return (x>=0 && x<n)&&(y>=0&&y<n);
	}

	public static void move(){
		//System.out.println("x: "+x+" y:"+y);
		int nx = x+dx[dirNum];
		int ny = y+dy[dirNum];
		if(isRange(nx,ny)){
			//System.out.println("dirNum:"+dirNum);
			x = x+dx[dirNum];
			y = y+dy[dirNum];
			//System.out.println(arr[x][y]);
			sum += arr[x][y];
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		t = sc.nextInt();
		arr = new int[n][n];

		order = sc.next();//실수

		for(int i = 0; i<n;i++){
			for(int j = 0; j<n;j++) {
				arr[i][j] = sc.nextInt(); //실수
			}
			
		}

		x = n/2;//실수
		y = n/2;

		for(int i=0; i<t;i++){
			//System.out.println(order.charAt(i));
			if(order.charAt(i)=='L')
				dirNum = (dirNum+3)%4;
			else if(order.charAt(i)=='R')
				dirNum = (dirNum+1)%4;
			else
				move();
		}

		System.out.print(sum+arr[n/2][n/2]);

	}

}
