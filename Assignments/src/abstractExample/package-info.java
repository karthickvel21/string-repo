package abstractExample;


public abstract class CALCU()
{
	
public CALCU()
	{
		System.out.println("Calclation default constructor");
	}
	
	public int add()
	{
		int a=10,b=20;
		int c=a+b;
		return c;
	}
	public int sub()
	{
		int a=22,b=20;
		int c=a-b;
		return c;
	}
	public int mul()
	{
		int a=10,b=2;
		int c=a*b;
		return c;
	}
	public abstract int div();
	public abstract double squr();
	public abstract double root();
}