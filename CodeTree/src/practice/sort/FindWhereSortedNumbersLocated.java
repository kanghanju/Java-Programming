package practice.sort;
import java.util.Scanner;
import java.util.Arrays;

class Num implements Comparable<Num>{
	int val,index;
	
	public Num(int val,int index) {
		this.val = val;
		this.index  = index;
	}
	
	@Override
	public int compareTo(Num num) {
		if(this.val == num.val)
			return this.index - num.index;
		return this.val - num.val;
	}
}
public class FindWhereSortedNumbersLocated {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Num[] arr = new Num[n];
		
		for(int i = 0; i<n;i++) {
			int val = sc.nextInt();
			int index = i+1;
			arr[i] = new Num(val,index);
		}
		
		Arrays.sort(arr);
		
		int[] rank = new int[n];
		
		for(int i = 0; i<n;i++) {
			rank[arr[i].index-1] = i+1;
		}
		
		for(int i = 0;i<n;i++) {
			System.out.print(rank[i]+" ");
		}
		
		
	}

}
