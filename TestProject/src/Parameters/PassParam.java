package Parameters;

public class PassParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Res;

		PassParam obj1 = new PassParam();
		obj1.add(4, 7);
		
		PassParam obj2 = new PassParam();
		obj2.multiply(5, 7);
		
		Calculation ob1 = new Calculation();
		Res = ob1.divide(9, 2);
		System.out.println("Answer is :"+Res);
				
		Res = ob1.Subtract(7, 3);
		System.out.println("Answer is :"+Res);
	}
	
	public void add(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("Ans is: "+c);
	}
	
	public void multiply(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println("Ans is: "+c);
	}

}
