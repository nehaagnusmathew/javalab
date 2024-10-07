package javalab;
import java.util.Scanner;
public class ExceptionHandling{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char confirmation;
		do {
		System.out.println("choose an operation");
		System.out.println("1:Arithmetic Operation");
		System.out.println("2:Array Access");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			try {
				System.out.println("enter numerator");
				int numerator=sc.nextInt();
				System.out.println("enter denominator");
				int denominator= sc.nextInt();
				int result = numerator/denominator;
				System.out.println("Result : "+result);
			}catch(ArithmeticException e) {
				System.out.println("caught an exception: "+e.getMessage());
			}
			break;
		case 2:
			int[] numbers = {1,2,3};
			try {
				System.out.println("Enter array index to access : ");
				int index=sc.nextInt();
				System.out.println("Element at index"+index+" : "+numbers[index]);
			}catch(ArrayIndexOutOfBoundsException e) { 
				System.out.println("caught an exception: "+e.getMessage());
			}
			break;
		default:System.out.println("Invalid choice enter case 1 or 2");
		break;
		}
		System.out.println("Do you want to continue? y/n");
		confirmation=sc.next().charAt(0);
		}while(confirmation == 'y'||confirmation=='Y');
		if(confirmation=='n'|| confirmation=='N')
		{
			System.out.println("successfully exited");
		}
	    sc.close();
	}}
