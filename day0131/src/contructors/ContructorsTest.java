package contructors;

class Point{
	int x;
	int y;
	public Point(int x) {
		this.x=x;
	}
	public Point(int x, int y) {
		this(x);
		this.y=y;
	}
}


public class ContructorsTest {
	public static void main(String[]args) {
		Point p = new Point();//기본 생성자를 정의하지 않았음.... 아래처럼 해야함
		//Point p = new Point(10);
		//Point p = new Point(10,20);
	}
}
