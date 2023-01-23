package basic;
import java.util.*;

public class minimumValueDifferenceBetweenTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int diff = 0;
        int min = 99;

        for(int i = 0 ; i<n;i++)
            arr[i]=sc.nextInt();

        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                diff = arr[j]-arr[i];
                if(diff<min)
                    min = diff;
            }
        }
        System.out.print(min);
        
        //시간복잡도 생각해서 다시 풀어보기
        //숫자들이 오름차순으로 주어지므로 두 숫자의 차 중에 최솟값은 반드시! 인접한 두수의 차 중에 있다!!
	}

}
