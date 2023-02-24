package practice.simulation2;

import java.util.Scanner;

public class RobotMovesSidetoSide {
	static int MAX = 1000000;
	static int[] A = new int[MAX+1];
	static int[] B = new int[MAX+1];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1;
        for(int i = 0; i<n;i++){
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d=='R'){
                for(int j=timeA;j<timeA+t;j++)
                    A[j] = A[j-1]+1;
                
            }
            else if(d=='L'){
                for(int j=timeA;j<timeA+t;j++){
                    A[j] = A[j-1]-1;
                }
            }
            
            timeA = timeA+t;  
        }

        int timeB = 1;
        //i<m을 i<n이라 작성하는 대참사로 인해 시간 오래걸림
        for(int i = 0; i<m;i++){
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d=='R'){
                for(int j=timeB;j<timeB+t;j++)
                    B[j] = B[j-1]+1;
            }
            else if(d=='L'){
                for(int j=timeB;j<timeB+t;j++){
                    B[j] = B[j-1]-1;
                }
            }
            timeB = timeB+t;  
        }

        int more = timeA >= timeB? timeA:timeB;
        if(more==timeA){
            for(int i = timeB;i<timeA;i++)
                B[i] = B[i-1];
        }
        else{
            for(int i = timeA;i<timeB;i++)
                A[i] = A[i-1];
        }

        int cnt = 0;
        for(int i=1;i<more;i++){
            if(A[i-1] != B[i-1] && A[i]==B[i]){
                cnt++;
                //System.out.println(i);
            }
        }
        
        System.out.println(cnt);
	}

}
