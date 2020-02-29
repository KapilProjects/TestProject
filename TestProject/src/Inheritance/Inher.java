package Inheritance;

public class Inher extends Base
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inher obj1 = new Inher();
		obj1.add();
		obj1.Sub();
		obj1.mul();
		obj1.Div();
		

	}
	
	public void add()
	{
		System.out.println("I m in Main class - Add");
	}
	
	public void Sub()
	{
		System.out.println("I m in Main class - Sub");
	}

}
