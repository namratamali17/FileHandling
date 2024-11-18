package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter w=new FileWriter("c:\\namu\\xyz.txt",true);
		w.write("hello world");
		w.close();
		System.out.println("file created.....");
		
		

	}

}
