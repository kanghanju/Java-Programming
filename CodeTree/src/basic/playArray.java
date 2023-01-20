package basic;
import java.util.Scanner;

public class playArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt_n = sc.nextInt();
		int cnt_q = sc.nextInt();
		int [] array = new int [cnt_n];


		//두 번째 줄:cnt_n개의 원소가 주어짐
		for(int i = 0; i<cnt_n;i++){
			array[i] = sc.nextInt();
		}

		for(int i = 0; i<cnt_q; i++){
			int qtype = sc.nextInt();

			if(qtype == 1){
				int a = sc.nextInt();
				System.out.println(array[a-1]+" ");
			}
			else if(qtype ==2){
				int a = sc.nextInt();

				int idx = -1; //해당 원소가 몇 번째 원소인지,없으면 0을 출력하기 위해 쓰는 변수 
				for(int j = 0; j<cnt_n;j++){
					if(array[j]==a){
						idx = j;
						break; //index가 가장 작은 원소를 찾자마자 break문을 쓴다
					}    
				}

				System.out.println(idx+1);
			}
			else{
				int a = sc.nextInt();
				int b = sc.nextInt();
				for(int j = a-1; j<b;j++){
					System.out.print(array[j]+" ");
				}
				//Q3을 끝내면 한줄띄워야 한다
				System.out.println();
			}
		}

	}

}
