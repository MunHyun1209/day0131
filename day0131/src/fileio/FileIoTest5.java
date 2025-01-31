package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIoTest5 {

	public static void main(String[] args) {
		
		String fileName="./test01.dat";
		
		try (FileReader fr= new FileReader(fileName)){
			char[] arrData= new char[10];
			while(true) {
				int readCount =  fr.read(arrData);
				if(readCount==-1) {
					break;
				}
				//StringIndexOutOFBoundsException->RuntimeException
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


