package basic;

import java.util.Scanner;

public class LoopTest03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수입력");
		int number = in.nextInt();
		if(number<0) {
			System.out.println("음수");
		}else{
			for(int i=1; i<=number; i++){
				//if(i%2==1)continue; 
				if(i%2==0) {
					System.out.print(i+" ");
				}
			  // <= 연산자 잘 확인하기 
			}
		}
		
		in.close();
		

	}

}
