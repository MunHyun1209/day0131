package basic;

import java.util.Scanner;

public class LoopTest01 {
/**
 * 정상 실행 결과 예시
 * 문자열을 입력
 * 박문현
 * 문자열을 입력: 케이에이치 정보교육원
 * 케이에이치 정보교육원
 */
	public void test(){
		Scanner in = new Scanner(System.in);
		while(false) {
			System.out.println("문자열을 입력하세요");
			String string=in.next();
			if(string == "q") {
				break;
			}
			System.out.println(string);
		}
		System.out.println("종료");
	}		
		//in.close();

		public static void main(String[] args) {
			LoopTest01 obj = new LoopTest01();
			obj.test();
		}

}
//빨간줄이 뜨는 원인을 기술해야하는 문제! ->
//15번줄 조건문의 false 때문에 조건문{}부분을 실행하지 못함
//while(false) -> while(true)로 바꿔야함



