
//�߻�Ŭ���� + ���
abstract class Shape4{
	//�Ӽ�
	String name;
	//�����ڸ޼���
	public Shape4(String name){
		this.name = name;
	}
	//�޼���
	public abstract void getArea();
	public abstract void getSurroundings();
}
class Circle4 extends Shape4{
	private double r;
	final double PI = 3.14;
	//�����ڸ޼���
	public Circle4(String name, double r) {
		super(name);
		this.r = r;
	}
	//�޼��� �������̵�
	public void getArea() {
		System.out.println(name+"�� ���� : " + (PI*r*r));
	}
	public void getSurroundings() {
		System.out.println(name+"�� �ѷ� : " + (2*PI*r));
	}
}
class Square4 extends Shape4{
	private double w,h;
	//�����ڸ޼���
	public Square4(String name, double w, double h) {
		super(name);
		this.w = w;
		this.h = h;
	}
	//�޼��� �������̵�
		public void getArea() {
			System.out.println(name+"�� ���� : " + w*h);
		}
		public void getSurroundings() {
			System.out.println(name+"�� �ѷ� : " + 2*(w+h));
		}
	}
class Control{ //ĸ��ȭ
	public void control(Shape4 s4){ //�Ķ���� => reference ����
		// �Ķ���� => int a, String name. . .
		s4.getArea();
		s4.getSurroundings();
	}
}
public class Shape4Test {
	public static void main(String[] args) {
		Circle4 c4 = new Circle4("��",3);
		Square4 s4 = new Square4("�簢��",5,6);
		Control ctrl = new Control();
		ctrl.control(c4);
		ctrl.control(s4);
	}
}

