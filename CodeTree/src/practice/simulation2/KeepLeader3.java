package practice.simulation2;
import java.util.Scanner;

public class KeepLeader3 {
	
	public static int n,m;
    public static int MAX = 1000000; //(N,M)*(v,t)
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[] A = new int[MAX+1];
        int[] B = new int[MAX+1];
        
        int timeA = 1;
        for(int i = 0; i<n;i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            int disPerHour = (v*t)/t;

            for(int j = timeA;j<timeA+t;j++)
                A[j] = A[j-1]+disPerHour;
            
            timeA += t;
        }

        int timeB = 1;
        for(int i = 0; i<m;i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            int disPerHour = (v*t)/t;

            for(int j = timeB;j<timeB+t;j++)
                B[j] = B[j-1]+disPerHour;
            
            timeB += t;
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

        int head = 0;
        int ans = 0;
        for(int i = 1; i<more;i++){
        	if(A[i] > B[i]) {
        		if(head == 2 || head==0)
        			ans++;
        		
        		head = 1;
        	}
        	else if(B[i]>A[i]) {
        		if(head == 1 || head==0)
        			ans++;
        		head = 2;
        	}
            else{
                if(head == 1 || head==2)
                    ans++;
                head=0;
            }   
      
        }
        System.out.print(ans);
	}

}
