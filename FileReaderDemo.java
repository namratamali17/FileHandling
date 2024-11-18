package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 FileReader r=new FileReader("c:\\namu\\abc.txt");
		 int i;
		  while((i=r.read())!=-1) {
				System.out.print((char)i);
				
			}
	}

}
