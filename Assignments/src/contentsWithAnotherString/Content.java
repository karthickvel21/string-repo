package contentsWithAnotherString;

import java.util.Scanner;

public class Content {

	public static void main(String[] args) 
	{
		//String a="this";
		
		//String b="welcome to Eclipse";
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String a=scan.nextLine();
		System.out.println("Enter the String 2:");
		String b=scan.nextLine();
		scan.close();
        String c[]=a.split(" ");
        String m=c[c.length-1];
        //System.out.println("value:"+m);
      //System.out.println("value matched:"+b.contains(m));
       if(b.contains(m))
       {
    	 System.out.println("TEXT match with another string");  
       }
       else
       {
      	 System.out.println("VALUE NOT MATCHED");  
         }
        /*for(int i=0;i<c.length;i++)
        {
        	System.out.println(c[i]);
        	
        }*/
     
	}
}