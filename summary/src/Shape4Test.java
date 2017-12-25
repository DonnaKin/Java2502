
//추상클래스 + 상속
abstract class Shape4{
	//속성
	String name;
	//생성자메서드
	public Shape4(String name){
		this.name = name;
	}
	//메서드
	public abstract void getArea();
	public abstract void getSurroundings();
}
class Circle4 extends Shape4{
	private double r;
	final double PI = 3.14;
	//생성자메서드
	public Circle4(String name, double r) {
		super(name);
		this.r = r;
	}
	//메서드 오버라이딩
	public void getArea() {
		System.out.println(name+"의 넓이 : " + (PI*r*r));
	}
	public void getSurroundings() {
		System.out.println(name+"의 둘레 : " + (2*PI*r));
	}
}
class Square4 extends Shape4{
	private double w,h;
	//생성자메서드
	public Square4(String name, double w, double h) {
		super(name);
		this.w = w;
		this.h = h;
	}
	//메서드 오버라이딩
		public void getArea() {
			System.out.println(name+"의 넓이 : " + w*h);
		}
		public void getSurroundings() {
			System.out.println(name+"의 둘레 : " + 2*(w+h));
		}
	}
class Control{ //캡슐화
	public void control(Shape4 s4){ //파라미터 => reference 변수
		// 파라미터 => int a, String name. . .
		s4.getArea();
		s4.getSurroundings();
	}
}
public class Shape4Test {
	public static void main(String[] args) {
		Circle4 c4 = new Circle4("원",3);
		Square4 s4 = new Square4("사각형",5,6);
		Control ctrl = new Control();
		ctrl.control(c4);
		ctrl.control(s4);
	}
}

