package practice.completeSearch1;

import java.util.Scanner;

public class Omok {

	public static int[][] arr = new int[19][19];
	
	//모든 칸을 순서대로 탐색하며, 특정 칸에 대해 주변 가로,세로,대각선으로 인접한
	//8개의 칸에 대해 해당 칸과 같은 종류의 바둑돌인지 확인한다/
	public static int DIR_NUM = 8;

	public static int[] dx = new int[]{0,-1,-1,-1,0,1,1,1};
	public static int[] dy = new int[]{1,1,0,-1,-1,-1,0,1};

	public static boolean isRange(int x, int y){
		return (x>=0 && x<19) &&(y>=0 && y<19);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//바둑알 입력
		for(int i = 0; i<19;i++)
			for(int j=0;j<19;j++)
				arr[i][j] = sc.nextInt();

		for(int i = 0 ; i<19;i++){
			for(int j = 0; j<19;j++){
				if(arr[i][j] == 0)
					continue;

				for(int k = 0; k<DIR_NUM;k++){
					int curx = i;
					int cury = j;
					int curt = 1;
					while(true){
						int nx = curx + dx[k];
						int ny = cury + dy[k];
						if(isRange(nx,ny) == false)
							break;
						//전에 놓인 것과 색이 다를경우
						if(arr[nx][ny] != arr[i][j])
							break;
						curt++;
						curx = nx;
						cury = ny;
					}
					if(curt==5){
						System.out.println(arr[i][j]);
						System.out.println((i+2*dx[k]+1)+" "+(j+2*dy[k]+1));
						System.exit(0);
					}
				}
			}
		}

		System.out.print(0);
	}

}
