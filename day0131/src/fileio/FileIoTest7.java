package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileIoTest7 {

	public static void main(String[] args) {
		
		String fileName="./test01.dat";//Reader일때 파일 이름확인!!
		//BufferedReader br; BufferedWriter bw;
		//BufferedInputStream bis; BufferedOutputStream bos;
		CharBuffer buffer = CharBuffer.allocate(1024);
		try (FileReader fr= new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)){//8192
			
			int readCount;
			//fr.read(arrData)가 readCount 대입 처리후 -1과 비교
			//readCount가 -1이 아니면{}실행 -1이면 반복문 탈출
			while(   (readCount =  fr.read(buffer))  !=-1  ) {
				buffer.flip();//읽기모드로 전환
				while(buffer.hasRemaining()) {
					System.out.print(buffer.get());//버퍼에서 문자읽기
				}
				buffer.clear();//버퍼를 비우고 쓰기모드로 전환
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않아요");
		}catch (IOException e) {
			System.out.println("파일을 읽지 못했습니다");
			}
		}
	}


