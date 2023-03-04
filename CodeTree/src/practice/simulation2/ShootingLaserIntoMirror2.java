package practice.simulation2;
import java.util.Scanner;


public class ShootingLaserIntoMirror2 {

	public static int n,k;
	public static char[][] arr;
	public static int x,y,dirNum; //k의 x좌표,y좌표,방향

	public static int dx[] = new int[]{1,0,-1,0};//S,E,N,W 
	public static int dy[] = new int[]{0,1,0,-1};

	public static void initialize(int k){
		if(k<=n){
			x = 0;
			y = k-1;
			dirNum = 0;
		}
		else if(k<=2*n){
			x = k-n-1;
			y = n-1;
			dirNum = 3;
		}
		else if(k<=3*n){
			x = n-1;
			y = n-(k-n*2); //이부분 생각해내기 어려웠다
			dirNum = 2;
		}
		else{
			x = n-(k-3*n);
			y = 0;
			dirNum = 1;
		}
	}

	public static boolean isRange(int x,int y){
		return (0<=x && x<n) && (y>=0 && y<n);
	}

	public static void move(int next){
		int nx = x+dx[next];
		int ny = y+dy[next];

		x = nx; y = ny;
		dirNum = next;
	}

	public static int simulate(){
		int cnt = 0;
		//System.out.println("x:"+x+" y:"+y);
		while(isRange(x,y)){
			if(arr[x][y]=='/'){
				move(3-dirNum);
			}
			else{
				move(dirNum^1);//XOR 0<->1/2<->3
			}
			
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new char[n][n];

		for(int i = 0; i<n;i++){
			String info = sc.next();
			for(int j = 0; j<n;j++){
				arr[i][j] = info.charAt(j);
			} 
		}

		k = sc.nextInt();
		initialize(k);

		int moveNum=simulate();

		System.out.println(moveNum);

	}

}
