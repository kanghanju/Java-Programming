package lesson1;

import java.util.Scanner;

public class Code9 {
//n개의 정수를 입력받아 순서대로 배열에 저장한다. 그런 다음 모든 정수들을 한 칸씩 오른쪽으로 shift한다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int [n];
		
		for(int i = 0; i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
//	마지막 값부터 처리해야 문제가 간단해진다
		int tmp = array[n-1];
		/*for(int i = n-1;i>0;i--) {
			array[i] = array[i-1];
			
		}*/
		for(int i = n-2; i>=0; i--) {
			array[i+1]=array[i];
		}
		array[0] = tmp;
		
		for(int i = 0;i<n;i++)
			System.out.println(array[i]);
	}

}
