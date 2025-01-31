package arrays;

public class ArraysTest01 {

	public static void main(String[] args) {
		
		String str="안녕하세요";
		System.out.println("str의 글자수 :"+str.length());
		
		String[]arr = new String[3];
		//arr[0]=null, arr[1]=null, arr[2]=null
		//자동으로 초기화함
		System.out.println("배열이 만든 변수 개수:"+arr.length);

		//String ar1,ar2,ar3;
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		
		//for(int i=1; i<=3; i++) {//조건식에 3이 포함되어있음 배열은 현재 0,1,2 까지 구성되어 있음
		for(int i=1; i<=3; i++) {
			System.out.println(arr[i]);//ArrayIndexOutOfBoundsException 범위에러 발생함
			System.out.println("글자수 출력: "+arr[i].length());
			//NullPointerException
		}
	
	
	}
	

}
//조건식의 길이와 배열의범위가 맞지 않음 16번째줄 for(int i=0; i<3; i++); 로 바뀌어야함.
//ArrayIndexOutOfBoundsException 범위에러 발생함
//i<arr.length
