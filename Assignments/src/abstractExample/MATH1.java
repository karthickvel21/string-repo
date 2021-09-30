package abstractExample;

import absEx.MATH;

public class MATH1 extends Imp {
	
public static void main (String args[])
{
	Imp obj2 = new Imp();
	MATH1 obj3=new MATH1();
	//MATH obj4=new MATH();
	System.out.println("Root value:"+obj2.root());
	System.out.println("add value:"+obj2.add());
	System.out.println("sub value:"+obj3.sub());
}
}
