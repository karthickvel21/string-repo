
public class AvgValueofArray {

	
	public void avg()
	{
		int a[]= {22,33,2,8,6};
		float avg=0,total=0;
		for (int i=0;i<a.length;i++)
		{
			total=a[i]+total;
			avg=a[i]+avg;
		
		}
		float avg1=avg/a.length;
		System.out.println("Total Array Value is:"+total);
		System.out.println("Array average,divided:"+a.length);
		System.out.println("The Array average value is:"+avg1);
	}
	public static void main(String[] args) {
		AvgValueofArray obj= new AvgValueofArray();
		obj.avg();

	}

}
