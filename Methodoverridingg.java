package javalab;
import java.util.Scanner;
class Employeee
{
	double salary,DA,HRA,salary1;
	Employeee(double salary,double DA,double HRA)
	{
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
	}
	void display()
	{
		System.out.println("Employee....");
	}
	void calcSalary()
	{
		salary1=salary+salary*(DA/100)+salary*(HRA/100);
		System.out.println("Gross salary of empolyee="+salary1);
	}
}
class Engineer extends Employeee
{
	Engineer(double salary,double DA,double HRA)
	{
		super(salary,DA,HRA);
	}
	void display()
	{
		super.display();
		super.calcSalary();
		System.out.println("Engineer...");
	}
	void calcSalary()
	{
		System.out.println("Gross salary of Engineer="+salary1*2);
	}
}
public class Methodoverridingg 
{
	public static void main(String[] args)
	{
		double salary,DA,HRA;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the basic salary of employee=");
		salary=s.nextDouble();
		System.out.println("Enter the DA% of the employee=");
		DA=s.nextDouble();
		System.out.println("Enter the HRA% of the employee=");
		HRA=s.nextDouble();
		Engineer e=new Engineer(salary,DA,HRA);
		e.display();
		e.calcSalary();
	}
}

