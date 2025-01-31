package diagram;

public class Point {

	// -(마이너스) / □
	private int x;
	private int y;
	//~ /＃
	
	int z;
	//# /◇
	
	// +  / ○ 비어있는 동그라미
	public static final double PI=3.141592;

	//+ / ●
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public static double getPi() {
		return PI;
	}
	
	
}
