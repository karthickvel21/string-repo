package findchariName;

public class CharinName {

	public static void main(String[] args) {
		String name="karthick a Aa";
		String cName=name.replaceAll("[^a]", "".trim());
		System.out.println("count is:"+cName);
		System.out.println("Number of a in your name:"+cName.length());

	}

}
