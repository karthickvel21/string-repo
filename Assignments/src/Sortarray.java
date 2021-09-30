import java.util.Arrays;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
Sortarray obj= new Sortarray();
obj.sortarr();
	}
	public void sortarr() {
		int arrayvalues[]= {12,2,34,-1,34,21,12};
		System.out.println("Original Array value is:");
    for (int i=0;i<arrayvalues.length;i++)
   {
    	System.out.print(arrayvalues[i] + " ");
	}
    
    //Arrays.sort(arrayvalues,2,5);
    Arrays.sort(arrayvalues);
    System.out.println("\nSorted Array values is");
    for(int arrvalue:arrayvalues)
    {
    	System.out.print(arrvalue +" ");
    }
    }
	
}

