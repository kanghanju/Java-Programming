package basic;
import java.util.Scanner;
//좌표로 생각해서 풀어보기 , 좌표에서 찾을 수 있는 규칙은 없나? i,j의 관계
public class findRule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			for(int j = 0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1)
					System.out.print("* ");
				else if(i>j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
