package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExmple {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
      FileOutputStream outobj=new FileOutputStream("c:\\namu\\abc.txt",true);
      String str ="wlecome to pune";
      byte bArray[]=str.getBytes();
         outobj.write(bArray);
         outobj.close();
	
      System.out.println("file create");
	}

}
