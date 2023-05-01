package practice.completeSearch2;
import java.util.Scanner;

public class DataCenterTemperatureAdjustment2 {

	public static int n,c,g,h;
	public static int[] ta = new int[1000];
	public static int[] tb = new int[1000];

	public static int count(int j){
		int totalEfficiency = 0;

		for(int i = 0; i < n; i++)
			totalEfficiency += singleEfficiency(ta[i],tb[i],j);
		return totalEfficiency;
	}

	public static int singleEfficiency(int low, int high,int t){
		if(t<low)
			return c;
		else if(t<= high)
			return g;
		else 
			return h;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = sc.nextInt();
		g = sc.nextInt();
		h = sc.nextInt();
		int max = 0;

		for(int i = 0; i<n; i++){
			ta[i] = sc.nextInt();
			tb[i] = sc.nextInt();
		}

		for(int j = 0; j <= 1000; j++){//온도
			int total = count(j);
		
			max = Math.max(max,total);
		}


		System.out.println(max);
	}
}
