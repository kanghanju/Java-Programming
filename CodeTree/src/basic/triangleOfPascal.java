package basic;

import java.util.Scanner;

public class triangleOfPascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        

        for(int i = 0; i<n;i++)
            arr[i][0] = 1;
        
        for(int i = 1; i<n;i++){
        
                for(int j = 1; j<n;j++){
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                    
                 }
        
            
        }

        for(int i =0; i<n;i++){
            for(int j = 0; j<n;j++){
                if(arr[i][j]==0)
                    continue; //그냥 이거 넣어서 0출력 안하면되는데 생각못하고 오래걸림
                System.out.print(arr[i][j]+" ");
            }
                
            System.out.println();
        }

	}

}
