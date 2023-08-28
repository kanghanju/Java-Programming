package algorithmLow.simulation;
import java.util.*;

public class MoveToNearestNeighborWithLargestNumberAtTheSameTime {
	static int n;
	static int[][] arr,count,nextCount;
	static int[] dx = {-1,1,0,0};//북남서동
	static int[] dy = {0,0,-1,1};

	public static void move(int x,int y){
		int max = 0; //인접한 숫자중 가장 큰 숫자 라는 조건을 못봤다
		int maxX=x,maxY=y;// 이부분을 maxX=0,maxY=0과 같이 별의미없는줄알고 초기화함,, 하지만 현재위치에 있는 수보다
		//큰 수가 나오지 않을 경우 현재위치에 nextCount 값을 ++해야한다.

		for(int i=0; i<4; i++){
			int moveX = x+dx[i];
			int moveY = y+dy[i];

			if(inRange(moveX,moveY)&&arr[moveX][moveY]>max){
				max = arr[moveX][moveY];
				maxX = moveX;
				maxY = moveY;
			}
		}
		nextCount[maxX][maxY] += 1;
	}

	public static void copyCnt(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				count[i][j] = nextCount[i][j];
			}
		}
	}

	public static void remove_over_2(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(count[i][j]>=2)count[i][j] = 0;
			}
		}
	}


	public static boolean inRange(int x,int y){
		return(x>=0 && x<n && y>=0 && y<n);
	}

	public static void resetNext(){
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				nextCount[i][j] = 0;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		arr = new int[n][n];
		count = new int[n][n];
		nextCount = new int[n][n];


		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();

		for(int i=0; i<m; i++){//m개의 구슬이 있는 위치를 count배열에 1로 표현
			int r = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			count[r][c] = 1;
		}



		while(t-->0){
			resetNext();
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(count[i][j]==1){
						move(i,j);
					}
				}
			}
			copyCnt();
			//System.out.println("--------------------");
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<n; j++) {
//					System.out.print(count[i][j]+" ");
//				}
//				System.out.println();
//			}
		
			remove_over_2();
		}

		int answer=0;
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				answer += count[i][j];

		System.out.print(answer);

	}

}
