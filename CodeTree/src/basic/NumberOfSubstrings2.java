package basic;

import java.util.Scanner;

public class NumberOfSubstrings2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		int ans = 0;

		int len = a.length();

		for(int i = 0; i < len - 1; i++)
			if(a.charAt(i) == b.charAt(0) && a.charAt(i + 1) == b.charAt(1))
				ans++;

		System.out.print(ans);
	}

}
