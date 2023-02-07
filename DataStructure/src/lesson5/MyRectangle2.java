package lesson5;

/*사각형의 면적: 평면상에 좌표축에 평생한 n개의 직사각형에 관한 데이터를 입력 받은 후 면적이 작은 것부터 
 * 큰 것 순으로 정렬하여 출력하는 프로그램을 작성하라 */
public class MyRectangle2 {
	public Mypoint2 lu;
	public int width;
	public int height;
	
	public MyRectangle2(int x,int y,int w,int h) {
		lu = new Mypoint2(x,y);
		width = w;
		height = h;
		
	}
	
	public int calcArea() {
		return width * height;
	}
	
	
	public String toString() {
		
			return "("+lu.x+", "+lu.y+") "+width+" "+height;
	}
}
