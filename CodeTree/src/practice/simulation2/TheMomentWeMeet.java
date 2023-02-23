package practice.simulation2;

import java.util.Scanner;

public class TheMomentWeMeet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //1000*1000+1
        int[] A = new int[1000001];
        int[] B = new int[1000001];
        
        //시간 index
        int timeA = 1;

        for(int i = 0; i<n;i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while(t-- > 0){//t가 1줄어들 때마다 1칸을 이동(왼,오)함
                if(d=='R')
                	//1초당 1만큼 이동한다 ->이부분을 생각 이상하게 했다
                    A[timeA] = A[timeA-1]+1;
                else   
                    A[timeA] = A[timeA-1]-1;
                timeA++;
            }
        }

        int timeB = 1;
        for(int i = 0; i<m;i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while(t-- > 0){
                if(d=='R')
                    B[timeB] = B[timeB-1]+1;
                else   
                    B[timeB] = B[timeB-1]-1;
                timeB++;
            }
        }

        int sec = 1;
        boolean isTrue = false;
        for(int i = 1; i<timeB;i++){
            if(A[i]==B[i]){
                isTrue = true;
                sec = i;
                break;
            }
                
        }

        if(isTrue)
            System.out.print(sec);
        else   
            System.out.print("-1");
	}

}
