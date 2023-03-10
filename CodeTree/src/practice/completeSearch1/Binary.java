package practice.completeSearch1;

import java.util.Scanner;

public class Binary {
	public static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String A =Integer.toString(a);
        

        int len=A.length();
        for(int i = 0; i<len;i++){
            int cnt = 0;
            int num =A.charAt(i)-'0';
            if(num == 1){
                String newA = A.substring(0, i) + '0' + A.substring(i + 1);
                for(int j = 0;j<len;j++){//괄호 !!!!
                    cnt += ((newA.charAt(j)-'0')*Math.pow(2,(len-j-1)));
                    }
             
                max = Math.max(max,cnt);
                }
            else{
                String newA = A.substring(0, i) + '1' + A.substring(i + 1);
                for(int j = 0;j<len;j++){
                    cnt += ((newA.charAt(j)-'0')*Math.pow(2,(len-j-1)));
                }
               
                max = Math.max(max,cnt);
                }
            }
        

        System.out.print(max);
	}

}
