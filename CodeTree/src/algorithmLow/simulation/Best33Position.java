package algorithmLow.simulation;
import java.util.*;

public class Best33Position {
	static int n;
    static int[][] arr;

    public static int count(int col1,int col2,int row1,int row2){
        int cnt=0;

        for(int i=col1; i<=col2; i++)
            for(int j=row1; j<=row2;j++)
                cnt += arr[i][j];
        
        //System.out.println("cnt:"+cnt);
        return cnt;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];

        for(int i = 0; i<n; i++)
            for(int j=0; j<n; j++)
                arr[i][j] = sc.nextInt();


        int result = 0;
        int max = 0;

        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2;j++){
                int colL = i;
                int colH = i+2;
                int rowL = j;
                int rowH = j+2;
                result = count(colL,colH,rowL,rowH);
                
                if(result > max)max = result;

            }
            // 이부분에 if문을 써서 계속 오답이 나왔다
        }

        System.out.println(max);
	}

}
