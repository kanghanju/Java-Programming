package lesson1;

import java.util.Scanner;

/*사용자로부터 n개의 정수를 입력받는다. 정수가 하나씩 입력될 때 마다 현재까지 입력된 정수들을 
 * 오름차순으로 정렬하여 출력하라 */
public class Code15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int [n];

		for(int i =0; i<n ; i++) {
			int tmp = sc.nextInt();
			
			int j = i - 1;
			while(array[j] > tmp && j>=0) {//j>=0을 뒤에 작성하면 에러남
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = tmp;
			
			for(int k = 0;  k<= i; k++)
				System.out.print(array[k]+" ");
			System.out.println();
		}
		sc.close();
	}

}
