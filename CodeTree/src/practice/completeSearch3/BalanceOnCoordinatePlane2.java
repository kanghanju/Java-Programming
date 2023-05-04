package practice.completeSearch3;
import java.util.Scanner;

public class BalanceOnCoordinatePlane2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int min = 100;
        for(int i = 2; i<= 100; i+=2){//x
            for(int j = 2; j<=100; j+=2){//y
                
                int[] area = new int[4];

                for(int k =0; k<n; k++){
                    if(x[k] > i && y[k] > j){
                        area[0]++;
                    }else if(x[k] < i && y[k] > j){
                        area[1]++;
                    }else if(x[k] < i && y[k] < j){
                        area[2]++;
                    }else{
                        area[3]++;
                    }
                    
                }

                int maxAreaVal=0;
                for(int k = 0; k<4; k++){
                    int val = area[k];
                    maxAreaVal = Math.max(maxAreaVal,val);
                }

                min = Math.min(maxAreaVal,min);
                
            }
        }

        System.out.print(min);
	}

}
