package practice.caseByCase;
import java.util.*;

public class AllOverlappingSegments {
	
	static int[] arr = new int[101];
    static int maxX1 = 0;
    static int minX2 = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            maxX1 = Math.max(x1,maxX1);
            minX2 = Math.min(x2,minX2);
        }

       

        if(minX2 >= maxX1){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
	}

}
