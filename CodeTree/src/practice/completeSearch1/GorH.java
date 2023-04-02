package practice.completeSearch1;
import java.util.Scanner;


public class GorH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] person = new int[n];
        char[] alphabet = new char[n];

        char[] arr = new char[10001];

        for(int i = 0; i < n;i++){
            person[i] = sc.nextInt(); //사람의 위치
            alphabet[i] = sc.next().charAt(0); //알파벳의 정보
        }

        for(int i = 0; i < n; i++){
            arr[person[i]] = alphabet[i];
        }

        int maxCnt = 0;
        for(int i = 1; i< 10001-k; i++){
            int num = 0;
            for(int j = i; j <= i+k ;j++ ){
                if(arr[j] =='H'){
                    num +=2;
                }else if(arr[j] == 'G')
                    num +=1;
                    
            }
            maxCnt = Math.max(maxCnt,num);
            
        }

        System.out.println(maxCnt);
	}

}
