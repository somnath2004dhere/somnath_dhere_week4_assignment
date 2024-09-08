package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Students {
	
	private int id;
	private String name;
	
	
	public Students(int rollNo, String name) {
		super();
		this.id = rollNo;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Students [ID=" + id + ", name=" + name + "]";
	}


	public int getid() {
		return id;
	}


	public void setId(int rollNo) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
