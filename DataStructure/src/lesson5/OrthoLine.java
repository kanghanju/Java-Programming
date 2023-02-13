package lesson5;

//평면상의 하나의 수직,수평선분을 나타내는 클래스 
public class OrthoLine {
	public Mypoint2 u; //두 점의 이름을 간단하게 u,v로 선언한다
	public Mypoint2 v;
	
	public OrthoLine(Mypoint2 p,Mypoint2 q) {
		u = p;
		v = q;
		if(p.x > q.x || p.x == q.x && q.y > p.y)//
			swap();
	}
	
	public void swap() {
		Mypoint2  tmp  = u;
		u = v;
		v = tmp;
	}
	
	//수직선분인가? x좌표가 같으면 수직선분 (수직또는 수평밖에 없다고 가정한다)
	public boolean isVertical() {
		return (u.x == v.x);
	}
	//2개의 선분이 교차하는가?
	public boolean intersects(OrthoLine other) {
		
		if(isVertical() && !other.isVertical()) {
			return(other.u.x < u.x && other.v.x > u.x &&other.u.y>v.y &&other.u.y <u.y);//
		}
		else if(!isVertical() && other.isVertical()) {
			return(other.u.y > u.y && other.v.y<u.y && other.u.x<v.x && other.u.x>u.x);//
		}
		else {
			return false;
		}
		
		
	}
}
