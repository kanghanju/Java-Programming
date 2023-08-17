package lesson10;

public abstract class Shape {
	public String shapeName;
	
	public Shape(String name) {
		this.shapeName = name;
	}
	
	public abstract double computerArea();
	public abstract double computerPerimeter();

}
