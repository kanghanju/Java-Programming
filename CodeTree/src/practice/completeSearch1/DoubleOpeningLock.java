package practice.completeSearch1;
import java.util.Scanner;

public class DoubleOpeningLock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int cnt = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n; j++){
                for(int k = 1; k<=n; k++){
                    if((Math.abs(a1-i)<=2 || Math.abs(a1-i)>= n-2) && (Math.abs(b1-j)<=2 || Math.abs(b1-j) >= n-2) &&
                        (Math.abs(c1-k)<=2 || Math.abs(c1-k) >= n - 2))
                        cnt++;
                    else if((Math.abs(a2-i)<=2 || Math.abs(a2-i)>= n-2) && (Math.abs(b2-j)<=2 || Math.abs(b2-j) >= n-2) &&
                        (Math.abs(c2-k)<=2 || Math.abs(c2-k) >= n - 2))
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
	}

}
