package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIoTest3 {

	public static void main(String[] args) {
		//파일 입출력
		//바이트기반(byte기반-InputStream,OutputStream)
		//텍스트기반(Char기반-Reader/Writer)
		//FileOutputStream fos;FileInputStream;
		//FileReader FileWriter fw;-> 이게 좀 더 편함
		String fileName="./test01.dat";//상대경로 or 절대경로
		//AutoCloseable~~ 자동으로 close 되고있음
		try (FileWriter fw=new FileWriter(fileName,true)){
			//예외가 발생하면 fw초기화 안될 수 있음
			//파일이 만약에 존재하지 않으면 자동으로 생성해줌.
			fw.write(97);
			fw.write('B');
			fw.write("문자열");
			//fw.flush();
		}catch(IOException e){		
			
		}

	}
}
