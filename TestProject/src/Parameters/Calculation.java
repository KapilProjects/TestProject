package Parameters;

public class Calculation {

	public int Subtract(int a, int b)
	{
		int Res;
		Res = a - b;
		return Res;
	}
	
	public float divide(float a, float b)
	{
		float Res;
		if (b != 0)
		{
			Res = a/b;
			return Res;
		}
		else
		{
			return 0;
		}
		
	}
}
