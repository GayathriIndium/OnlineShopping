package Basics;
import java.lang.*;
import java.util.*;
public class Employee{
	String empId;
	String fname;
	String lname;
	int experience;
	String designation;
	double salary;
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	Employee(){
		
	}
	
	Employee(String empId, String fname, String lname, int experience,String designation, double salary){
		this.empId=empId;
		this.fname=fname;
		this.lname=lname;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void displaySalary() {
		System.out.println("The monthly salary is : "+salary);
		System.out.println("The yearly salary is : "+(salary*12));
	}
    public void assignDesignation() {
    	if(experience==1) {
    		designation="Fresher";
    	}
    	else if(experience>=3 && experience<=5) {
    		designation="Team Lead";
    	}
    	else if(experience>=6 && experience<=10) {
    		designation="Manager";
    	}
    	else if(experience>10) {
    		designation="Senior Manager";
    	}
    }
    public void hikeSalary() {
    	if(experience>=3 && experience<=5) {
    		salary=salary+(0.1*salary);
    	}
    	else if(experience>=6 && experience<=10) {
    		salary=salary+(0.2*salary);
    	}
    	else if(experience>10) {
    		salary=salary+(0.3*salary);
    	}
    }
	public void empDetails() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee First Name : "+fname);
		System.out.println("Employee Last Name : "+lname);
		System.out.println("Company Experience : "+experience);
		System.out.println("Company Designation : "+designation);
		System.out.println("Monthly Salary : "+salary);
		System.out.println("The Yearly salary is : "+(salary*12));
	}
}