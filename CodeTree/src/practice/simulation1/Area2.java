package practice.simulation1;

import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] area = new int[2001];
        int loc = 1000;
        int cnt = 0;

        for(int i = 0; i<n;i++){
            int dist = sc.nextInt();
            char dirc = sc.next().charAt(0);

            if(dirc == 'R'){
                for(int j = loc; j<loc+dist;j++){
                    area[j] += 1;
                }
                loc = loc+dist;
            }
            else{
                for(int j = loc-1; j>=loc-dist;j--){
                    area[j] += 1;
                }
                loc = loc-dist;
            }
        }

        for(int i = 0; i<area.length;i++){
            if(area[i] >= 2)
                cnt++;
        }

        System.out.print(cnt);
	}

}
