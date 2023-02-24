package practice.simulation2;
import java.util.Scanner;
import java.util.Arrays;

class Shake implements Comparable<Shake>{
	int time,person1,person2;

	public Shake(int time,int person1,int person2){
		this.time = time;
		this.person1 = person1;
		this.person2 = person2;
	}

	@Override
	public int compareTo(Shake shake){
		return this.time - shake.time;
	}
};

public class CorrelationBetweenHandshakeAndInfectiousDisease2 {
	
	public static int MAX_T = 250;
	public static int MAX_N = 100;

	public static int N,K,P,T;
	public static int[] infected = new int[MAX_N+1];
	public static int[] shakeNum = new int[MAX_N+1]; //N명의 개발자가 각각 악수한 횟수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N명의 개발자
		int K = sc.nextInt(); //K번의 악수까지만 감염
		int P = sc.nextInt(); //처음 전염병에 걸린 P번의 개발자
		int T = sc.nextInt(); //T번에 걸쳐 t초에 x개발자가y개발자와 악수

		infected[P] = 1;
		Shake[] shakes = new Shake[MAX_T]; //왜 MAX_T+1이 아닌지 생각해보기

		//t초에 x개발자와 y개발자가 악수
		for(int i =0; i<T;i++){
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			shakes[i] = new Shake(t,x,y);
		}

		Arrays.sort(shakes,0,T);

		for(int i = 0;i<T;i++){
			int target1=shakes[i].person1;
			int target2=shakes[i].person2;

			//감염되어 있을 경우 ++
			if(infected[target1]==1)
				shakeNum[target1]++;
			if(infected[target2]==1)
				shakeNum[target2]++;

			if(infected[target1]==1 && shakeNum[target1]<=K)
				infected[target2]=1;

			if(infected[target2]==1 && shakeNum[target2]<=K)
				infected[target1]=1;

		}

		for(int i = 1; i<=N;i++){
			if(infected[i]==1)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}

}
