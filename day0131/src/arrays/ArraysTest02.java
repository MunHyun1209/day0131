package arrays;

import java.util.Scanner;

class Student{

	String name;
	int grade;
	
	public Student(	String name,int grade) {
		this.name= name;
		this.grade=grade;
		}
}
public class ArraysTest02 {
	public static void main(String[]args) {
		Student student=new Student("박문현",4);
		System.out.println("이름:"+student.name+",학년:"+student.grade);
		
		Student[] stds=new Student[3];
		//stds[0]=null,stds[1]=null,stds[2]=null,
		Scanner in = new Scanner(System.in);
		for(int i=0; i <stds.length; i++) {
			System.out.println("이름을 입력하세요");
			String name=in.nextLine();
			System.out.println("학년을 입력하세요");
			int grede=in.nextInt();// 4엔터
			//엔터제거해야합니다.
			in.nextLine();
			stds[i]=new Student(name, grade);
		}
		
		for(int i=0; i<stds.length; i++) {
			System.out.println("이름: "+stds[i].name);//name에서 에러가 발생함 값이 null(초기화 한 값이없음)
		}
	}
}
