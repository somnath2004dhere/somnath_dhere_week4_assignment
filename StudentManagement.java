package Assignment4;

import java.util.ArrayList;

public class StudentManagement {
	
	ArrayList<Students> students= new ArrayList<Students>();
	
	
	public void add( int id,String name) {
		
		students.add(new Students(id, name)); 
	}
	
	public void removeStudent( int id) {
		
		
		students.removeIf(student -> student.getid() == id);
		
		
	}

	
	public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Students student : students) {
                System.out.println(student);
            }
        }
    }
}
