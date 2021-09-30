
public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PatternTwo obj = new PatternTwo();
obj.patternEx();
	}
public void patternEx()
{
	int column=6;
	System.out.println("Pattern A");
	for (int i=0;i<column-1;i++)
	{
		//System.out.print("*"+ " ");
		System.out.println(" ");
		for(int j=0;j<column;j++)
		{
			System.out.print("*"+ " ");
		}
		
	}
}
}
