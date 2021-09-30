
public class SumOfArray
{

	public static void main(String[] args) 
	{
		int []a= {2,10,30,1};
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++)
			
		{
			sum=a[i]+sum;
			
		}
		
		System.out.println("Sum of an Array(Using for loop) value is:"+sum);
		
        System.out.println("==========>>>>>><<<<<<<=============");
	for (int val:a)
	{
		 sum1=val+sum1;
	}
	System.out.println("Sum of an Array(Using for each loop) value is:"+sum1);
}
}


