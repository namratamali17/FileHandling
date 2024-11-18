package filehandling;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name,degignation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String degignation) {
		super();
		this.id = id;
		this.name = name;
		this.degignation = degignation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id="+id+",name="+name+",degignation= "+degignation +"]";
	}
	

}
