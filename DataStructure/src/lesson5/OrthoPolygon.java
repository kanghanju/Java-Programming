package lesson5;

//다각형 객체
public class OrthoPolygon {
	public int n; //꼭짓점 저장개수
	public Mypoint2 [] vertices; //꼭짓점 저장 배열
	
	public OrthoPolygon(int k) {
		n = 0;
		vertices = new Mypoint2 [k];
	}
	
	public void addVertex(int x, int y) {
		vertices[n++] = new Mypoint2(x,y); 
	}
	
	public int maxX() {
		int max = vertices[0].x;
		for(int i = 0; i<n;i++) {
			if(vertices[i].x >max) {
				max = vertices[i].x;
			}
		}
		return max;
	}
	
	//내부에 p를 포함하는지 여부를 판단하는 함수
	public boolean contains(Mypoint2 p) {
		OrthoLine arrow = new OrthoLine(p,new Mypoint2(maxX()+1,p.y));
		
		int count = 0;
		//꼭짓점이 n개면 변도 n개
		for(int i = 0; i<n;i++) {
			OrthoLine edge = new OrthoLine(vertices[i],vertices[(i+1)%n]);
			if(arrow.intersects(edge))
				count++;
		}
		return (count%2==1);
	}

}
