package javalab;

import java.util.Scanner;
class Employee
{
	String name;
	int age;
	long phonenumber;
	String address;
	float salary;
    Employee(String name1,int age1,long phonenumber1,String address1,float salary1)
    {
    	name=name1;
    	age=age1;
    	phonenumber=phonenumber1;
    	address=address1;
    	salary=salary1;
    }
    void printEmployee()
    {
    	System.out.println("name: " +name);
    	System.out.println("age: " +age);
    	System.out.println("phonenumber:" + phonenumber);
    	System.out.println("address:" +address);
    }
    void printsalary()
    {
    	System.out.println("salary:" +salary);
}
}
class Officer extends Employee
{
	String specialization;
	Officer(String name1,int age1,long phonenumber1,String address1,float salary1,String specialization1)
	{
	 super(name1,age1,phonenumber1,address1,salary1);
	 specialization=specialization1;
	} 
	void printspecialization()
	{
		System.out.println("specialization:" +specialization);
		
	}
}
class Manager extends Employee
{
	String department;
	Manager(String name1,int age1,long phonenumber1,String address1,float salary1,String department1)
	{
		super(name1,age1,phonenumber1,address1,salary1);
		department=department1;
	}
	void printdepartment()
	{
		System.out.println("department:" +department);
	}
}
public class Inheritence
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		long phonenumber;
		String address;
		float salary;
		String specialization;
		String department;
		System.out.println("Enter the details of officer:");
		System.out.print("Name : ");
		name=sc.nextLine();
		System.out.print("Age: ");
		age=sc.nextInt();
		System.out.print("Phone number:");
		phonenumber=sc.nextLong();
		sc.nextLine();
		System.out.print("Address: ");
		address=sc.nextLine();
		System.out.print("Salary :");
		salary=sc.nextFloat();
		sc.nextLine();
		System.out.print("specialization:");
		specialization=sc.nextLine();
		Officer off=new Officer(name,age,phonenumber,address,salary,specialization);
		System.out.println("enter the details of manager:");
		System.out.print("Name:");
		name=sc.nextLine();
		System.out.print("Age: ");
		age=sc.nextInt();
		System.out.print("Phone number:");
		phonenumber=sc.nextLong();
		sc.nextLine();
		System.out.print("Address: ");
		address=sc.nextLine();
		System.out.print("Salary :");
		salary=sc.nextFloat();
		sc.nextLine();
		System.out.print("Department:");
		department=sc.nextLine();
		Manager ma=new Manager(name,age,phonenumber,address,salary,department);
		off.printEmployee();
		off.printsalary();
		off.printspecialization();
		ma.printEmployee();
		ma.printsalary();
		ma.printdepartment();
        sc.close();
	}
}
