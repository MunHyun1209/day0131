package overload;

public class Printer {

	void print() {}
	void print(String data) {}//6, 12, 13 String 끼리 충돌
	void print(int data) {}
	void print(double data) {}
	void print(Object... data) {}
	void print(int data1,int data2) {}//둘다 int
	void print(int data2,int data1) {}//둘다 int
	void print(String aaa) {}//
	String print(String data) {}//
	
}
//매개변수의 타입이 달라야한다 -> 같아서 충돌이 일어남
//String , int
//10,11 매개변수가  int,int 둘중 하나는 int,double 이렇게 변경해줘야함
//6,12 매개변수 이름이 다르다고 오버로딩 허용안함