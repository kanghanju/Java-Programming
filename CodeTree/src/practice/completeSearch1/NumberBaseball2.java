package practice.completeSearch1;
import java.util.Scanner;

public class NumberBaseball2 {
	public static int[] number;
	public static int[] count1;
	public static int[] count2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		number = new int[n];
		count1 = new int[n];
		count2 = new int[n];
		
		for(int i = 0; i<n; i++) {
			number[i] = sc.nextInt();
			count1[i] = sc.nextInt();
			count2[i] = sc.nextInt();
		}
		
		int answer = 0;
		
		for(int i = 1; i < 9; i++) {
			for(int j = 1; j < 9; j++) {
				if(i==j)continue;
				for(int k = 1; k < 9; k++) {
					if(k==j || k==i)continue;
					int count = 0;
					
					for(int q = 0; q < n; q++) {
						int cnt1 = 0;
						int cnt2 = 0;
						
						int a = number[q]/100;
						int b = number[q]/10%10;
						int c = number[q]%10;
						
						if(i==a) cnt1++;
						if(j==b) cnt1++;
						if(k==c) cnt1++;
						
						if(i==b || i==c)cnt2++;
						if(j==a || j==c)cnt2++;
						if(k==a || k==b)cnt2++;					
						
				
						
						if((cnt1 != count1[q]) || (cnt2 != count2[q]))break;
						
					
						count++;
						
					}
					
					if(count == n)
						answer++;
				}
			}
		}
		
		System.out.println(answer);
		
	}

}
