package charinString;

import java.util.Scanner;

public class StringEx 
{

	public static void main(String[] args) 
	{
		
//String s= "Java Exercises!";
Scanner scan1=new Scanner(System.in);
System.out.println("Enter the Original String:");
String s=scan1.nextLine();
//scan1.close();
System.out.println("Original String="+s);
System.out.println("Length:"+(s.length()-1));
Scanner scan = new Scanner(System.in);
System.out.println("Enter the char at position(Index):");
String value= scan.nextLine();
scan.close();
scan1.close();
int value1=Integer.parseInt(value);

if(value1<s.length())
{
System.out.println("The character at position  "+value+" is "+s.charAt(value1));
}
else
{
	System.out.println("Entered position not found!!!");
}

	}
	
	
}
