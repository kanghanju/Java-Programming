package lesson1;
import java.util.Scanner;
//정수 n개를 입력받는다.이어서 n개의 정수를 입력받아 순서대로 배열에 저장한다.그런 다음 중복된 정수쌍의
//개수를 카운트하여 출력하라.
public class Code11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int [n];
		
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i<n-1 ; i++) {
			for(int j = i+1; j<n;j++) {
				if(array[i]==array[j])
					count++;
			}
		}
		
		System.out.println(count);
	}

}
