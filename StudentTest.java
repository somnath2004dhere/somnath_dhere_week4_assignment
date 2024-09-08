package Assignment4;

import java.util.Scanner;



public class StudentTest {
	public static void main(String[] args) {
		
		StudentManagement studentManagement=new StudentManagement();
		
		int choice;
		Scanner scanner=new Scanner(System.in);
		
		do {
		 System.out.println("\nStudent Management System");
         System.out.println("1. Add Student");
         System.out.println("2. Remove Student");
         System.out.println("3. Display Students");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         
         choice = scanner.nextInt();
         
         switch (choice) {
		case 1: {
			System.out.println("Enter the id and name:");
			int id=scanner.nextInt();
			String name=scanner.nextLine();
			studentManagement.add(id, name);
		}
			break;
		case 2: 
			System.out.println("Enter the Id:");
			int id=scanner.nextInt();
			studentManagement.removeStudent(id);
			break;
		case 3: 
			studentManagement.displayStudents();
			break;
		case 4:
            System.out.println("Exiting...");
            break;
            
            
        default:
            System.out.println("Invalid choice. Please try again.");
			
         }
         
         
		}while(choice !=4);
	
	}

}
