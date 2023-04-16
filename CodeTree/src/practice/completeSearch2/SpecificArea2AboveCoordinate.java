package practice.completeSearch2;
import java.util.Scanner;

public class SpecificArea2AboveCoordinate {
	
	public static int[][] coord;
    public static int[] x = new int[100];
    public static int[] y = new int[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int area = Integer.MAX_VALUE;
        for(int i = 0; i < n ; i++){ //i번째 좌표를 뺀다

            //남은 점들 중 직사각형의 최소 넓이를 구하려면 남은 점들 중
            //x좌표 중 최소,최대 , y좌표 중 최소,최대를 구해야 한다
            int minX =40000, maxX = 0;
            int minY = 40000,maxY = 0;
            for(int j = 0; j<n; j++){ //i를 제외한 모든 좌표
                if(i==j) continue;

                minX = Math.min(minX,x[j]);
                minY = Math.min(minY,y[j]);
                maxX = Math.max(maxX,x[j]);
                maxY = Math.max(maxY,y[j]);

            }// for문을 다 돌고나면 x중 최대,최소 y중 최대,최소 값이 나온다

            area = Math.min(area,(maxX-minX)*(maxY-minY));
        }

        System.out.print(area);
	}

}
