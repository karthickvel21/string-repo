
import java.util.Scanner;

public class IndexOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IndexOfArray obj=new IndexOfArray();
obj.indexarray();
	}
	public void indexarray()
	{
	int a[]= {10,20,2,1,45};
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the value to find an index:");
	int value= scan.nextInt();
	scan.close();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==value)
		{
			System.out.println("Index value of an element:"+i);
			break;
		}
		else
		{
			System.out.println("Entered value not found in an array");
			break;
		}
	
			
		
	}
	//System.out.println("Entered value not found in an array");
	}
	

}
