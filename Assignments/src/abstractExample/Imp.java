package abstractExample;

import absEx.MATH;

public class Imp extends MATH {

	public static void main(String[] args) {
		//CALE obj= new CALE();
Imp obj=new Imp();
System.out.println("Addition value is:"+obj.add());
System.out.println("Division value is:"+obj.div());
System.out.println("Squr value is:"+obj.squr());
	}

	@Override
	public int div() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public double squr() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	public double root() {
		return 44;
		// TODO Auto-generated method stub
		
	}

}
