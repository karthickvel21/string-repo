package stringSequence;

import java.util.Scanner;

public class StringContainsSequence {

	public static void main(String[] args) {
		String seq="test the job!!!";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sequence of char:");
		String seq1= scan.nextLine();
		scan.close();
		if(seq.contains(seq1))
		{
		System.out.println("Sequence text is:"+seq.contains(seq1));
		System.out.println("Sequence Value found");
		}
		else
		{
			System.out.println("sequence Value not found!!!!");
		}

	}

}

