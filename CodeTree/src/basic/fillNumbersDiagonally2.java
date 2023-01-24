package basic;
import java.util.Scanner;

public class fillNumbersDiagonally2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int m = sc.nextInt();
	    int [][]arr = new int [n][m];
	    int num = 1;
	    
	    for(int i=0; i<n;i++) {
	    	for(int j = 0; j<m;j++) {
	    		if(arr[i][j]==0) {
	    			int curRow = i;
		    		int curCol = j;
		    		
		    		while(curRow<n && curCol>=0) {
		    			arr[curRow][curCol]= num;
		    			
		    			curRow++;
		    			curCol--;
		    			num++;
		    		}
	    		}
	    		
	    	}
	    }
	    
	    for(int i = 0; i<n;i++) {
	    	for(int j = 0; j<m;j++)
	    		System.out.print(arr[i][j]+" ");
	    	System.out.println();
	    }
	     
	     
	}

}
