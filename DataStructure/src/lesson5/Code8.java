package lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code8 {
	
	static MyRectangle2 [] rects = new MyRectangle2[100]; //주의
	static int n = 0;
	
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("mypointData.txt"));
			
			while(in.hasNext()) {
				int x = in.nextInt();
				int y = in.nextInt();
				int w = in.nextInt();
				int h = in.nextInt();
				
				
				rects[n] = new MyRectangle2(x,y,w,h);//주의
				n++;
			}
			
			
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i =0; i<n;i++)
				System.out.println(rects[i].toString());
	}
	
	private static void bubbleSort() {
		for(int i = 0; i<n-1;i++) {
			for(int j = 0; j<n-1-i; j++) {
				if(rects[j].calcArea() > rects[j+1].calcArea()) {
					MyRectangle2 tmp = rects[j]; //주의 Myrectangle객체의 값을 바꾼게 아니라 두 객체의 자리!!!를 바꾼다
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
		
	}

	
}
