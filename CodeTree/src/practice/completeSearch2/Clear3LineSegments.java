package practice.completeSearch2;
import java.util.Scanner;

public class Clear3LineSegments {
	
    public static int[] start;
    public static int[] end;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i<n; i++){
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int cnt = 0;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    
                    boolean overlap = false;
                    int[] arr =new int[101];

                    for(int x =0; x<n;x++){
                        if(x==i || x==j || x==k)continue;

                        for(int y = start[x]; y<=end[x]; y++) arr[y]++;
                    }


                    for(int x = 0; x<101; x++){
                        if(arr[x] > 1)overlap = true;
                    }

                    if(overlap == false)
                        cnt++;

                }
            }
        }

        System.out.println(cnt);
	}

}
