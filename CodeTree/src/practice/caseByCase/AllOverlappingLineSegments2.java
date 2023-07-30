package practice.caseByCase;
import java.util.*;

public class AllOverlappingLineSegments2 {
	
	static boolean result;

    static int[] x1 = new int[100];
    static int[] x2 = new int[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        for(int skip = 0; skip<n; skip++){
            int maxX1 = 0;
            int minX2 = 100;
            boolean possible = false;
            for(int i = 0; i < n; i++){
                if(i==skip)continue;

                maxX1 = Math.max(maxX1,x1[i]);
                minX2 = Math.min(minX2,x2[i]);
            }

            if(maxX1 > minX2){
                possible = false;
            }else{
                possible = true;
            }

            if(possible)
                result = true;
        }

        if(result){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
        
	}

}
