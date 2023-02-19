package lesson6;

/*우리가 첫번째로 해야할 일은 프로그램내에서 하나의 항을 표현하기 위한 클래스를 작성한다*/
public class Term3 {
	private int coef;//계수
	private int expo;//지수
	
	public Term3(int c,int e) {
		setCoef(c);
		expo = e;
	}
	
	public int getExpo() {//getter method
		return expo;
	}
	
	public int calcTerm(int x) {

		return (int)(getCoef() * Math.pow(x,expo));
	}
	
	public  void printTerm() {
		System.out.print(getCoef() + "x^"+expo); //-x^2 ==> +-1x^2 로 출력되는 문제가있다
	}

	public int getCoef() { //getter,accessor 
		return coef;
	}

	public void setCoef(int coef) {//setter,mutator
		this.coef = coef;
	}
}
