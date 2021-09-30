import java.util.Scanner;

public class ArraySpecificValue
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,240,8};
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the specific value:");
		int value=scan.nextInt();
		scan.close();		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==value)
				
			{
				System.out.println(a[i]+" "+"Entered value is present in the Array");
				continue;
			}
				else {
			System.out.println("Entered value not found");
			break;
				}
		}
		
	//System.out.println("value not available");
	}
	
}
