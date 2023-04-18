package practice.completeSearch2;
import java.util.Scanner;

public class NonOverlappingLineDivision2 {
	
	public static int[] x1;
    public static int[] x2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n개의 선분 
        x1 = new int[n];
        x2 = new int[n];

        //x1,x2가 주어진다
        for(int i = 0; i < n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        
        int cnt = 0;
        // 겹치지 않는 선분의 수를 찾는다 . 하나의 선분에 대해 겹치는 선분을 완전탐색으로 찾는다 
        for(int i = 0; i<n;i++){
        	
        	boolean overlap = false;
            
            for(int j = 0; j<n; j++){ //x1좌표에 해당하는 선분 x2좌표를 찾아낸다
                if(i==j)continue; //자기자신과는 무조건 겹치므로 continue

                if((x1[i] <= x1[j] && x2[i] >= x2[j]) || (x1[i] >= x1[j] && x2[i] <= x2[j])){
                    overlap = true;
                    break;
                }
 
            }
            
            if(overlap == false)
            	cnt++;
            
        }

        System.out.print(cnt);
	}

}
