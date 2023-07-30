package practice.caseByCase;
import java.util.*;

public class CleaningTheArea {

	static int[] arr = new int[101];

	public static boolean intersecting(int x1,int x2,int x3,int x4){
		if(x2 < x3 || x4 < x1){
			return false;
		}else{
			return true;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = sc.nextInt();
		int d = sc.nextInt();

		int cnt = 0;

		if(intersecting(a,b,c,d)){
			System.out.print(Math.max(b,d)-Math.min(a,c));

		}else{
			System.out.print((b-a)+(d-c));
		}
	}

}
