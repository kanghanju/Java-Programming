package lesson5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import lesson5.Mypoint2;
import lesson5.OrthoPolygon;

public class Code10 {

	public static void main(String[] args) {
		
		
		try {
			Scanner in = new Scanner(new File("orthoLine.txt"));
			int n = in.nextInt();
			OrthoPolygon thePolygon = new OrthoPolygon(n); //꼭짓점의 개수를 입력받아 다각형을 생성
			for(int i = 0; i<n;i++) {//꼭짓점의 좌표를 시계방향 순서로 입력받아 다각형에 추가한다
				thePolygon.addVertex(in.nextInt(),in.nextInt());
			}
			//다각형 입력이 완료. 다각형 객체 생성
			
			//테스트하고싶은 점 thePoint
			Mypoint2 thePoint = new Mypoint2(in.nextInt(),in.nextInt());
			
			in.close();
			
			if(thePolygon.contains(thePoint))
				System.out.println("Yes");
			else
				System.out.println("No");
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}
	}

}
