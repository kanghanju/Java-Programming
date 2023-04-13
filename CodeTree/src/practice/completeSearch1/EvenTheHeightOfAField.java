package practice.completeSearch1;
import java.util.Scanner;

public class EvenTheHeightOfAField {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();

        int[] height = new int[n];

        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= n-t; i++){
        	int val = 0;
        	for(int j = i; j<i+t; j++)
        		val += Math.abs(height[j] - h);
        	
        	min = Math.min(val, min);
        }
        
       
        System.out.println(min);
	}

}
