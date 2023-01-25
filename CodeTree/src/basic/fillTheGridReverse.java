package basic;
import java.util.Scanner;

public class fillTheGridReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int [][]arr = new int[n][n];
        int cnt = 1;

        for(int start=n-1;start>=0;start--){
        
            int curCol = start;

            if(cnt%2==1){
            	
                for(int curRow = n-1; curRow>=0;curRow--){
                    arr[curRow][curCol] = num;
                    num++;
                    
                }
                cnt++;
                
            }else{
            	
                 for(int curRow = 0; curRow<n;curRow++){
                    arr[curRow][curCol] = num;
                    num++;
                    

                }
                 cnt++;
                
            }
            
        }

        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
	}

}
