package practice.simulation1;

import java.util.Scanner;

public class WhiteBlackening {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] area = new char[200001];
        int[] bCnt = new int[200001];
        int[] wCnt = new int[200001];
        int loc = 100000;
        int cnt = 0;

        for(int i = 0; i<n;i++){
            int dist = sc.nextInt();
            char dirc = sc.next().charAt(0);

            if(dirc == 'R'){
                for(int j = loc; j<=loc+dist-1;j++){
                    area[j] = 'b';
                    bCnt[j] += 1;

                }
                loc = loc+dist-1;
            }
            else{
                for(int j = loc; j>=loc-dist+1;j--){
                    area[j] = 'w';
                    wCnt[j] += 1;
                }
                loc = loc-dist+1;
            }
        }
        
        int cntW = 0;
        int cntB = 0;
        int cntG = 0;
        for(int i = 0; i<area.length;i++){
            if(bCnt[i] >=2 && wCnt[i] >=2)
                cntG++;
            else if(area[i]=='b')
                cntB++;
            else if(area[i]=='w')
                cntW++;
                
        }

        System.out.print(cntW+" "+cntB+" "+cntG);
	}

}
