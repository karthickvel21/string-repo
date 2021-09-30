
public class OddorEven {

	
	
	public static void main(String[] args) {
		int a[]= {20,110,51,60,33};
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
		System.out.println(a[i]+" "+"is Even number");
		//System.out.println("array value is:"+a[i]);
			}
			else
			{
				System.out.println(a[i]+" "+"is Odd Number");
			}
		
		}
		//System.out.println("length of array:"+a.length);
	}

}
