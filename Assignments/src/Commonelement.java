import java.util.Arrays;

public class Commonelement {

	public static void main(String[] args) {
	Commonelement obj2 = new Commonelement();
	obj2.common();
	}

	public void common()
	{
		int a[]= {2,9,1,7};
		int b[]= {2,1,9,6,48,7};
		System.out.println("1st Array values:"+Arrays.toString(a));
		System.out.println("2nd Array values:"+Arrays.toString(b));
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					System.out.println("common value is:"+(a[i]));
					break;
				}
			}
		}
	}
	
}
