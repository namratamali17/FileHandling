package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream t=new FileInputStream("c:\\namu\\abc.txt");
		int i=0;
		while ((i=t.read())!=-1) {
			System.out.print((char)i);
			
		}
		t.close();

	}

}
