package javalab;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Filereaderwrite{
public static void main(String args[]) {
	try {
		Scanner sc=new Scanner(System.in);
		File obj1=new File("Register1.txt");
		obj1.createNewFile();
		System.out.println("Register1.txt created \n");
		FileWriter fout= new FileWriter("Register1.txt");
		System.out.println("enter your KEAM rank number");
		int n=sc.nextInt();
		fout.write(n+ "\n");
		fout.close();
		System.out.println("Data added");
		FileReader fin=new FileReader("Register1.txt");
		BufferedReader br=new BufferedReader(fin);
		String line;
		System.out.print("\n content of Register1.txt is : ");
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		}
	catch(IOException e) {
		System.out.println("An error occured." +e.getMessage());
	}
	}
}