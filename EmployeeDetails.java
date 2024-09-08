package Assignment4;

import java.util.HashMap;

public class EmployeeDetails {
	
	HashMap<Integer, Employee> hashMap=new HashMap<Integer, Employee>();
	
	
	public void addEmployee( int id,String name,String Department) {
		
		hashMap.put(id, new Employee(id, name, Department));
		
	}
	
	public void removeEmployee(int id) {
		
		hashMap.remove(id);
	}
	
	  public Employee getEmployee(int id) {
	        return hashMap.get(id);
	    }
	  
	public void displayEmployee() {
		
		 if (hashMap.isEmpty()) {
	            System.out.println("Empty...");
	        } else {
	            for (Employee employee : hashMap.values()) {
	                System.out.println(employee);
	            }
	        }
	}

}
