package lesson10;
import java.util.Scanner;

public class ShapeApplication {
	
	public int capacity = 10;
	//사용자가 입력한 도형들을 저장하기 위한 배열
	private Shape [] shapes = new Shape[capacity];
	private int n = 0; //저장된 도형들의 개수 
	private Scanner kb = new Scanner(System.in);
	

	public void processCommand() {
		
		while(true) {
			System.out.println("$ ");
			String command = kb.next();
			if(command.equals("add"))
				handAdd();
			else if(command.equals("show") || command.equals("showdetail"))
				handShow(command.equals("showdetail")); //showdetail 명령이면 true
			else if(command.equals("sort"))
				handSort();
			else if(command.equals("exit"))
				break;
		}
		
		kb.close();
	}
	
	private void handSort() {
		// TODO Auto-generated method stub
		
	}

	private void handShow(boolean detailed) {//showdetail명령이면 true
		for(int i =0; i<n; i++) {
			System.out.println(shapes[i].toString());
			if(detailed) {
				System.out.println("    The area is "+shapes[i].computerArea());
				System.out.println("    The perimeter is "+shapes[i].computerPerimeter());
			}
		}
	}

	private void handAdd() {
		String type = kb.next(); //R,C,T
		switch(type) { 
		case "R":
			int w = kb.nextInt();
			int h = kb.nextInt();
			Rectangle r = new Rectangle(w,h);
			addShape(r);
			break;
		case "C":
			int radius = kb.nextInt();
			Circle c = new Circle(radius);
			addShape(c);
			break;
		case "T":
			//addShape(new Triangle(kb.nextInt()));
			break;
		}
		
	}

	private void addShape(Shape shape) {
		
		shapes[n++] = shape;
		
	}

	public static void main(String[] args) {
		ShapeApplication app = new ShapeApplication();
		app.processCommand(); //main함수 할일 끝 
	}

}
