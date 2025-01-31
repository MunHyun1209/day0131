package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIoTest04 {

	public static void main(String[] args) {
		
		String fileName="./test01.dat";
		FileReader fr=null;
		
		try {
			fr= new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) {
				fr.close();//NullPointerException 발생할 수 있음

				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
