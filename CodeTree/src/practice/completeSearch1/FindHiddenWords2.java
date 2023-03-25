package practice.completeSearch1;
import java.util.Scanner;

public class FindHiddenWords2 {

	public static int n,m;
	public static String[] arr; 
	public static int cnt = 0;

	public static int[] dx = {0,1,1,1,0,-1,-1,-1};
	public static int[] dy = {1,1,0,-1,-1,-1,0,1};

	public static boolean isRange(int x,int y){
		return (x>=0 && x<n) && (y>=0 && y<m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new String[n];
		
		for(int i = 0; i<n;i++)
			arr[i] = sc.next();


		for(int i = 0; i<n; i++){
			for(int j = 0; j<m; j++){
				if(arr[i].charAt(j) != 'L')
					continue;
				
				for(int k = 0; k<8; k++){
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					//isRange(nx+1,ny+1)이라 해서 오래걸렸다. 방향에 따라 1칸을 전진해야함
					if( (isRange(nx,ny)&&arr[nx].charAt(ny)=='E') && (isRange(nx+dx[k],ny+dy[k])&&arr[nx+dx[k]].charAt(ny+dy[k])=='E'))
						cnt++;

				}
			}
		}

		System.out.print(cnt);
	}

}
