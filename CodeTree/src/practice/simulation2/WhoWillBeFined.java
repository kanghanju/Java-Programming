package practice.simulation2;

import java.util.Scanner;

public class WhoWillBeFined {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  =sc.nextInt();
        int k = sc.nextInt();
        
        int[] penalizedPerson = new int[10000];
        //index 0은 사용을 안함
        int[] penaltyNum = new int[101];

        for(int i = 0; i<m;i++)
            penalizedPerson[i] = sc.nextInt();

        int ans = -1;
        for(int i =0; i<m;i++){
            //벌 받은 학생의 번호 target
            int target = penalizedPerson[i];
            penaltyNum[target]++;

            if(penaltyNum[target] >= k){
                ans = target;
                break;
            }
        }
        
        System.out.print(ans);
	}

}
