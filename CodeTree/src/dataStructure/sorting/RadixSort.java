package dataStructure.sorting;
import java.util.*;

public class RadixSort {
	static int n;
    static int[] arr = new int[100000];

    static final int MAX_K = 6; //자릿수
    static final int MAX_DIGIT = 10; //0~9

    public static void radixSort(){
        int p = 1; //해당 자릿수 digit을 구하기 위해 사용하는 변수

        for(int pos = 0; pos < MAX_K; pos++){//pos: 자릿수
            ArrayList<Integer>[] arrNew = new ArrayList[MAX_DIGIT];
            for(int i = 0; i<MAX_DIGIT; i++){
                arrNew[i] = new ArrayList<>();
            }

            for(int i = 0; i<n; i++){
                int digit = (arr[i]/p)%10; //자릿수 해당 숫자 구하기
                arrNew[digit].add(arr[i]);
            }

            int index = 0;
            for(int i = 0; i<MAX_DIGIT;i++){
                for(int j = 0; j<arrNew[i].size(); j++){
                    arr[index++] = arrNew[i].get(j); //pos번째 자릿수 정렬을 한 arr
                }
            }

            p*= 10;
        }
    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        radixSort();

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
	}

}
