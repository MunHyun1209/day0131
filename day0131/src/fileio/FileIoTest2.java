package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIoTest2 {

	public static void main(String[] args) {
		//파일 입출력
		//바이트기반(byte기반-InputStream,OutputStream)
		//텍스트기반(Char기반-Reader/Writer)
		//FileOutputStream fos;FileInputStream;
		//FileReader fr; FileWriter fw;-> 이게 좀 더 편함
		String fileName="./test01.dat";//상대경로 or 절대경로
		FileWriter fw=null;//초기화 해줘야함
		try {
			fw=new FileWriter(fileName, true);//예외가 발생하면 fw초기화 안될 수 있음
			//파일이 만약에 존재하지 않으면 자동으로 생성해줌.
			fw.write(97);
			fw.write('B');
			fw.write("문자열\n");
			fw.flush();//버퍼에 남아있는 데이터를 강제로 파일에 기록해라~~

		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {if(fw!=null)fw.close();} catch (IOException e) {}//close 기억하고있기
			//System.out.println(fw);
		}
		
		
	}

}
