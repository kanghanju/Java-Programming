package basic;
import java.util.Scanner;

public class fillNumbersDiagonally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int [n][m];
        int num = 1;

        for(int startCol=0; startCol < m;startCol++){
            //현재 위치인 변수를 선언후 초기화한다
            int curRow = 0;
            int curCol = startCol;

            //curCol>=0 이고 curRow<n 을 충족해야 범위를 안벗어난다
            while(curRow<n && curCol>=0){
                arr[curRow][curCol] = num;

                curRow++;
                curCol--;
                num++;
            }
        }

        for(int startRow = 1;startRow<n;startRow++){
            int curRow = startRow;
            int curCol = m-1;

            while(curRow<n && curCol>=0){
                arr[curRow][curCol] = num;

                curRow++;
                curCol--;
                num++;
            }
        }

        for(int row = 0; row<n;row++){
            for(int col = 0; col<m;col++)
                System.out.print(arr[row][col]+" ");
            System.out.println();
        }
	}

}
