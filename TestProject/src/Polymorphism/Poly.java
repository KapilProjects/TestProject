package Polymorphism;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int RealRes;
		Poly obj1 = new Poly();
		RealRes = obj1.add(4, 76);
		System.out.println("Actual result is"+RealRes);
		RealRes = obj1.add(23, 7, 2);
		System.out.println("Actual result is"+RealRes);
		
		

	}
	
	public int add(int a, int b)
	{
		int Res;
		Res = a+b;
		return Res;
	}
	
	public int add(int a, int b, int c)
	{
		int Res;
		Res = a+b+c;
		return Res;
	}

}
