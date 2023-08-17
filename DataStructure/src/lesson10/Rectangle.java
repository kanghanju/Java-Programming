package lesson10;

public class Rectangle extends Shape{
	public int width;
	public int height;
	
	public Rectangle(int w,int h) {
		super("Rectangle"); //shape name이 Rectangle
		width = w;
		height = h;
	}
	
	public double computerArea() {//shape메서드 안에있는 추상 메서드를 실제 구현했다
		return (double)width*height;
	}
	
	public double computerPerimeter() {
		return 2.0*(width*height);
	}
	
	public String toString() {
		return "Rectangle: width is "+width+", height is "+height;
	}
}
