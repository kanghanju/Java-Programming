package basic;
import java.util.Scanner;

public class minMax999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        
        int i =0;
        while(true){
            arr[i] = sc.nextInt();
            if(arr[i]==999 || arr[i]==-999){
                break;
            }
            i++;
        }
        
        int maxVal = arr[0];
        int minVal = arr[0];

        for(int j = 1; j<arr.length;j++){
            if(arr[j]==999 || arr[j]==-999){
                break;
            }
            if(arr[j]>maxVal)
                maxVal = arr[j];
            if(minVal > arr[j])
                minVal = arr[j];
        }
        System.out.print(maxVal+" "+minVal);

	}

}
