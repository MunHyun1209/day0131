package basic;

import java.util.Scanner;

public class LoopTest2 {
/**
 * 정상 실행 결과 예시
 * 문자열을 입력
 * 박문현
 * 문자열을 입력: 케이에이치 정보교육원
 * 케이에이치 정보교육원
 * 종료!
 */
	public void test(){
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요");
			String string=in.next();
			if(string.equals("q"))
				break;
			System.out.println(string);
		}
			System.out.println("종료!!");
	}
		
			
		//in.close();

		public static void main(String[] args) {
			LoopTest2 obj = new LoopTest2();
			obj.test();
		}

}
//20 break때문에 21번줄에 도달하지 못함.
//18 in.next(); 문자열 토큰 까지만 처리됨 : 공백은 문자열로 처리되지않음
//18 in.next()-> in.nextline() 으로 변경 틀림
//19번 if(string =="q") -> ifstring.equals("q")로 변경 해야함