package Basics;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		String id,fname1,lname1,designation1;
		int n,exp;
		double salary1;
		System.out.println("Enter the number of employees\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++) {
			Scanner sc1Scanner=new Scanner(System.in);
			System.out.println("Enter the employee id:\n");
			id=sc1Scanner.nextLine();
			System.out.println("Enter the employee First Name:\n");
			fname1=sc1Scanner.nextLine();
			System.out.println("Enter the employee Last Name:\n");
			lname1=sc1Scanner.nextLine();
			System.out.println("Enter the employee Designation:");
			designation1=sc1Scanner.nextLine();
			System.out.println("Enter the employee Experience:\n");
			exp=sc1Scanner.nextInt();
			System.out.println("Enter the employee Salary:\n");
			salary1=sc1Scanner.nextDouble();
			emp[i]=new Employee(id,fname1,lname1,exp,designation1,salary1);
			emp[i].setEmpId(id);
			emp[i].setFname(fname1);
			emp[i].setLname(lname1);
			emp[i].setExperience(exp);
			emp[i].setDesignation(designation1);
			emp[i].setSalary(salary1);
	}
		for(int i=0;i<n;i++) {
			System.out.println("\n");
			System.out.println("The salary before hiking is");
			emp[i].empDetails();
			System.out.println("The yearly salary for initially ");
			emp[i].displaySalary();
			emp[i].assignDesignation();
			System.out.println("The salary after hiking is ");
			emp[i].hikeSalary();
			emp[i].empDetails();
			
		}
}
}
