package javalab;
import java.util.Scanner;
public class Palindrome
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string:");
  String str=sc.nextLine();
  int flag=0;
  int len=str.length();
  for(int i=0;i<len/2;i++)
  {
   if (str.charAt(i)!=str.charAt(len-i-1))
   {
    flag=1;
   }
  }
  if (flag==0)
  {
   System.out.println("Palindrome");
  }
  else
  {
   System.out.println("Not Palindrome");
  }
 }
}