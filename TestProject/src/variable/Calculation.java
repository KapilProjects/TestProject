package variable;

public class Calculation {

	int a;
	int b;
	int res;
	
	public int addition(int x, int y)
	{
		a = x;
		b = y;
		res = a + b;
		return res;
	}
	
	public int subtraction(int x, int y)
	{
		a = x;
		b = y;
		res = a - b;
		return res;
	}
	
	public int multiplication(int x, int y)
	{
		a = x;
		b = y;
		res = a * b;
		return res;
	}
}
