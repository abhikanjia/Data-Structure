/*Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a
program to read the detail from user and print it
*/

import java.util.Scanner;

class Employee_Detail{
	int Employee_id;
	String Name;
	String Designation;
	double Salary;

	Scanner sc = new Scanner(System.in);
	Scanner s=new Scanner(System.in);

	void EmpDetails(){
		System.out.println("Enter Employee_id : ");
		int Employee_id = sc.nextInt();

		System.out.println("Enter Name : ");
		String Name = s.nextLine();

		System.out.println("Enter Designation : ");
		String Designation = s.nextLine();

		System.out.println("Enter Salary : ");
		double Salary = sc.nextDouble();

		System.out.println("-----details-----");

		System.out.println("Employee_id: "+Employee_id);
		System.out.println("Name: "+Name);
		System.out.println("Designation: "+Designation);
		System.out.println("Salary: "+Salary);
	}
}


public class Employee_demo{
	public static void main(String[] args) {
		Employee_Detail e1 = new Employee_Detail();
		e1.EmpDetails();
	}
}