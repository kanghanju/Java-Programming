package practice.completeSearch1;
import java.util.Arrays;
import java.util.Scanner;

public class BeautifulSequence2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        int[] A = new int[n];
        int[] B = new int[m];
        int[] tmp = new int[n]; //새로운 배열을 생성해서 비교하는 포인트

        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        for(int i = 0; i < m; i++)
            B[i] = sc.nextInt();
        
        Arrays.sort(B); //배열을 비교할대 정렬해서 비교하는 아이디어 

        for(int i = 0; i<(n-B.length)+1; i++){
            for(int j=0; j<B.length; j++){
                tmp[j] = A[i+j];
            }
            Arrays.sort(tmp,0,m);

            boolean isTrue = true;
            for(int j = 0; j< B.length; j++){
                if(tmp[j] != B[j]){
                    isTrue = false;
                    break;
                }

            }

            if(isTrue)
                cnt++;
        }
        
        
        System.out.println(cnt);
	}

}
