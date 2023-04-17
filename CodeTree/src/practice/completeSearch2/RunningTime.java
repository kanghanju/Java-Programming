package practice.completeSearch2;
import java.util.Scanner;


public class RunningTime {
	
	public static int[] arr = new int[1001];
    public static int[] start;
    public static int[] end;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        start = new int[n];
        end = new int[n];

        for(int i = 0; i<n;i++){
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();

            for(int j = start[i]; j<end[i]; j++){
                arr[j]++;
            }
        }


        int maxHour = 0;
        int cnt = 0;
        //해고될 직원 1명을 정한다 
        for(int i= 0; i<n;i++){
            
            for(int j=start[i]; j<end[i]; j++){
                arr[j]--;
            }

            cnt = 0;
            for(int j = 0 ; j<1001; j++){
                if(arr[j]!=0){
                    cnt++;
                }
            }

            for(int j=start[i]; j<end[i]; j++){
                arr[j]++;;
            }

            maxHour = Math.max(maxHour,cnt);
            //System.out.println(maxHour);
        }

        System.out.println(maxHour);
	}

}
