package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIoTest6 {

	public static void main(String[] args) {
		
		String fileName="./test01.dat";
		
		try (FileReader fr= new FileReader(fileName)){
			char[] arrData= new char[10];
			int readCount;
			
			//fr.read(arrData)가 readCount 대입 처리후 -1과 비교
			//readCount가 -1이 아니면{}실행 -1이면 반복문 탈출
			while(   (readCount =  fr.read(arrData)   )   !=-1  ) {
				String readStr=new String(arrData, 0, readCount); 
				System.out.println(readStr);
		}
			
		}catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않아요");
		}catch (IOException e) {
			System.out.println("파일을 읽지 못했습니다");
			}
		}
	}


