package practice.completeSearch2;
import java.util.Scanner;

public class InterestingNumber2 {
	
	public static int[] arr = {0,0,0,0,0,0,0,0,0,0};
    public static int allDigits =0;

    public static void digitCount(int i){
        while(i>0){
            int r = i%10; //일의 자리
            i = i/10; 
            arr[r]++;
            allDigits++;
   
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = 0;
        for(int i = x; i<=y; i++){
            
            allDigits = 0;

            for(int j = 0; j<10; j++){
                arr[j] = 0;
            }

            digitCount(i);
    
            for(int j = 0; j<10; j++){
                //System.out.print(arr[j]+" ");
                if(arr[j] == allDigits -1){//*
                    ans++;
                }
            }
            //System.out.println();
        }

        System.out.print(ans);
	}

}
