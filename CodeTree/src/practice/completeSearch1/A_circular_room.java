package practice.completeSearch1;

import java.util.Scanner;

public class A_circular_room {
	public static int[] arr;
    public static int[] people;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n개의 원
        arr = new int[n];
        people = new int[n];
        int sum = 0;

        for(int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
        }
        
        int min = Integer.MAX_VALUE;
       
        
        for(int i = 0; i<n;i++){
            int dist = 0;
            int startIdx = i;
            people[i] = sum;
            
            for(int j = 0; j<n;j++){
                int diff =  people[startIdx]-arr[startIdx];
                startIdx = (startIdx+1)%n;
                people[startIdx] = diff;
                dist += diff;
                
            }
           // System.out.println(dist);
            if(min>dist)
                min = dist;
        }
        System.out.print(min);
	}

}
