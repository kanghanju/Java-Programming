package practice.sort;
import java.util.Scanner;
import java.util.Arrays;


class Point implements Comparable<Point>{
	int dist,num;

	public Point(int dist,int num){
		this.dist = dist;
		this.num = num;
	}

	public int compareTo(Point point){
		if(this.dist == point.dist)
			return this.num - point.num;
		return this.dist - point.dist;
	}
}

public class DistanceFromOrigin {

	public static int getDistFromOrigin(int x, int y){
		return Math.abs(x)+Math.abs(y);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] points = new Point[n];

		for(int i = 0; i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int num = i+1;

			points[i] = new Point(getDistFromOrigin(x,y),num);
		}

		Arrays.sort(points);

		for(int i = 0; i<n;i++)
			System.out.println(points[i].num);

	}

}
