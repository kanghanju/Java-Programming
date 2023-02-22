package practice.simulation1;

import java.util.Scanner;

public class MinimumAreaOfSquaretoCoverDebris {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[][] area = new int[2001][2001];

        for(int i = 0; i<2;i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j=x1+1000; j<x2+1000;j++){
                for(int k=y1+1000;k<y2+1000;k++){
                    area[j][k] += i+1;
                }
            }
        }

        int minX = 2002;
        int minY = 2002;
        int maxX  =0;
        int maxY = 0;
        int cnt = 0;
        boolean exist = false;

        for(int i = 0; i<2001;i++){
            for(int j = 0; j<2001;j++){
                if(area[i][j] == 1){
                    exist = true;
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        if(exist){
            int restArea = ((maxX-minX)+1)*((maxY-minY)+1);
            System.out.print(restArea);
        }
        else{
            System.out.print("0");
        }
	}

}
