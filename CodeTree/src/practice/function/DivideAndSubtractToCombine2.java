package practice.function;

import java.util.Scanner;

public class  DivideAndSubtractToCombine2 {    
    public static int n,m;
    public static int[] arr = new int[100];

    
    // 문제에서 구하고자 하는 값을 반환합니다.
    public static int getAnswer() {
       int sum = 0;

        while(m!=1){
        	sum += arr[m-1];
            if(m%2==1)
                m--;
            else{
               
                m = m/2;
            }
        }

        return sum+arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        for(int i = 0; i < n1; i++)
            arr[i] = sc.nextInt();
        n = n1;
        m = m1;
        System.out.print(getAnswer());
    }
}