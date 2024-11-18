package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Employee e=new Employee(101,"namu","java ");
      FileOutputStream obj=new FileOutputStream("c:\\namu\\serilization.txt");
      ObjectOutputStream outobj=new ObjectOutputStream(obj);
      outobj.writeObject(e);
      outobj.flush();
      System.out.println("coverted..... to ...... byte.....stream ......");
      
	}

}
