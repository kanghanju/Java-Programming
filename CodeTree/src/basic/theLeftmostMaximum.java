package basic;
import java.util.Scanner;

public class theLeftmostMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [1000];

        for(int i = 0; i<n;i++)
            arr[i] = sc.nextInt();
        
        while(true){//"위의 과정을 끊임없이 반복하며"->while문 
            int maxIdx = 0; //최대값 후보의 index인 변수

            for(int i = 1; i<n;i++){
                if(arr[i]>arr[maxIdx]) //최대값이 여러개인경우 부등호가 >이므로 가장 왼쪽에 있는 원소가 뽑힌다
                    maxIdx = i;
                }
            System.out.print((maxIdx+1)+" ");

            if(maxIdx == 0)
                break;
            
            n = maxIdx;

            
        }
	}

}
