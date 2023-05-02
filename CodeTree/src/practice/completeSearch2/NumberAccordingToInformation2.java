package practice.completeSearch2;
import java.util.Scanner;


public class NumberAccordingToInformation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //T개의 알파벳
        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] arr = new char[1001];

        for(int i = 0; i<T; i++){
            char c = sc.next().charAt(0);
            int index = sc.nextInt();
            arr[index] = c;
        }

        int ans =0;

        for(int i = a; i<= b; i++){//특별한 위치를 찾기위해 완전탐색

            int d1Can = 0;
            int d1 = 1000;
            for(int j = 1; j<=1000; j++){//d1을 찾기
                if(arr[j] != 'S')continue;

                d1Can = j;
                int distance = Math.abs(j-i);
                d1 = Math.min(distance,d1);
            }

            int d2Can = 0;
            int d2 = 1000;
            for(int j = 1; j<=1000; j++){//d2을 찾기
                if(arr[j] != 'N')continue;

                d2Can = j;
                int distance = Math.abs(j-i);
                d2 = Math.min(distance,d2);
            }

            if(d1 <= d2)ans++;

        }

        System.out.print(ans);

	}

}
