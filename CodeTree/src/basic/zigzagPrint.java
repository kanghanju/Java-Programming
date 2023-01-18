package basic;

import java.util.Scanner;

public class zigzagPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				if(i%2==0) {
					System.out.print((n*i)+1+j+" ");
				}else {
					System.out.print(n*(i+1)-j+" ");
				}
			}
			System.out.println();
		}
		/*n,i,j를 조합해 수를 만들어내는게 어려웠음*/
	}

}
