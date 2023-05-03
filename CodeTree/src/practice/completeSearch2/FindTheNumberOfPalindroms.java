package practice.completeSearch2;
import java.util.*;

public class FindTheNumberOfPalindroms {
	
	public static int[] arr = new int[7];
	
	public static int div(int i){
        int cnt = 0; //자릿수
        arr =new int[] {0,0,0,0,0,0,0};
        
        while(i>0){
            int r= i%10;
            arr[cnt++] = r;
            i = i/10;
        }

        return cnt;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;

        for(int i = x; i<=y; i++){
            
            int cnt = div(i);

            boolean isTrue = true;
            for(int j=0; j<(cnt/2); j++){
                if(arr[j] != arr[cnt-1-j]){
                    isTrue = false;
                    break;
                }
            }

            if(isTrue)ans++;

        }

        System.out.println(ans);
	}

}

//Integer.toString()을 이용해 비교하는 방법도 있다 
