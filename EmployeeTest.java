package Assignment4;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		EmployeeDetails details=new EmployeeDetails();
		
		 Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Employee Management System");
	            
	            System.out.println("1. Add Employee");
	            System.out.println("2. Remove Employee");
	            System.out.println("3. Get Employee");
	            
	            System.out.println("4. Display Employees");
	            System.out.println("5. Exit");
	            
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	            
	                case 1:
	                    System.out.print("Enter employee ID: ");
	                    int id = scanner.nextInt();
	                    
	                    scanner.nextLine(); 
	                    System.out.print("Enter employee name: ");
	                    String name = scanner.nextLine();
	                    
	                    System.out.print("Enter employee department: ");
	                    String department = scanner.nextLine();
	                    details.addEmployee(id, name, department);
	                    break;
	                    
	                case 2:
	                    System.out.print("Enter employee ID to remove: ");
	                    id = scanner.nextInt();
	                    details.removeEmployee(id);
	                    break;
	                case 3:
	                    System.out.print("Enter employee ID to get details: ");
	                    id = scanner.nextInt();
	                    Employee employee = details.getEmployee(id);
	                    if (employee != null) {
	                        System.out.println(employee);
	                    } else {
	                        System.out.println("Employee not found.");
	                    }
	                    break;
	                    
	                case 4:
	                    details.displayEmployee();
	                    break;
	                    
	                case 5:
	                	
	                    System.out.println("Exiting...");
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	            
	        } while (choice != 5);

	        scanner.close();
	}
}
