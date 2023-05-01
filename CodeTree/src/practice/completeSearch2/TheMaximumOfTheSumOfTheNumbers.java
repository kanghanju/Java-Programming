package practice.completeSearch2;
import java.util.Scanner;

public class TheMaximumOfTheSumOfTheNumbers {
	public static int x,y;
	
	public static int digitSum(int i) {
		if(i<10)
			return i;
		
		else
			return digitSum(i/10)+i%10;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		int ans = 0;
		for(int i = x; i<=y; i++) {
			ans = Math.max(ans, digitSum(i));
		}
		
		System.out.println(ans);
	}

}
