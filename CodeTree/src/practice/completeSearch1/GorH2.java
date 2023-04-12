package practice.completeSearch1;
import java.util.Scanner;

public class GorH2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[101];

        for(int i = 0; i < n; i++){
            int index = sc.nextInt();
            char alphabet = sc.next().charAt(0);
            arr[index] = alphabet;
        }


        int max = 0;

        for(int i = 0; i<101; i++){
            
            for(int j = i+1; j < 101; j++){
                
                if(arr[i]==0 || arr[j]==0)//양끝은 0이면 안됨, k for문 안의 else조건으로 써서 틀림
                    continue;

                int gCnt = 0; //원래 첫번째 for문과 두번째 for문 사이에 썼음
                int hCnt = 0;

                for(int k = i; k<= j; k++){
                    if(arr[k] == 'G'){
                        gCnt++;
                    }else if(arr[k] =='H'){
                        hCnt++;
                    }
                }

                //if문도 처음에 k for문 안에 썼음
                if(gCnt==0 || hCnt==0 || gCnt==hCnt){
                     int size = j-i;
                      max = Math.max(size,max);
                }
               
            }
        }

        System.out.println(max);
	}

}
