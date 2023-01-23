package basic;
import java.util.Scanner;

public class CarDeal {

	public static void main(String[] args) {
		//내가 푼 코드, 나중에 시간복잡도 줄여서 다시 풀어보기!!
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int bft = 0;
        int max = 0;

        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j<n;j++){
                bft = arr[j]-arr[i];
                if(bft<0)
                    continue;
                else if(bft>0 && bft>max)
                    max = bft;
            }
        }
        System.out.print(max);
	}

}
