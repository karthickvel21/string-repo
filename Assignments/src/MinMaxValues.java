import java.util.Arrays;

public class MinMaxValues {

	public static void main(String[] args) {
	MinMaxValues obj=new MinMaxValues();
	obj.calcultion();
		

	}
public void calcultion()
{
	int a[]= {3,4,5,6,-1};
	System.out.println("Original Array value is:");
	for(int value:a) {
		System.out.print(value+ " ");
	}
	System.out.print("\n");
	Arrays.sort(a);
	System.out.println("sorting Array value is:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+ " ");
	}
	System.out.print("\n");
	System.out.println("Minimum value is:"+a[0]);
	System.out.println("Maximum value is:"+a[a.length-1]);
}
}
