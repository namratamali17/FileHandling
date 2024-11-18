package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DesirilizationExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("c:\\namu\\serilization.txt"));
		Employee e=(Employee) obj.readObject();
		System.out.println(e);
		obj.close();
	}

}
