package Interface;

public class Interface implements Iface, Iface2
{
	int x, y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj1 = new Interface();
		System.out.println(Iface.z);
		obj1.Add();
		obj1.Sub();
		obj1.mul();
		obj1.div();

	}

	@Override
	public void Add() {
		// TODO Auto-generated method stub		
		System.out.println("I m in side Add - from infterface1");
	}

	@Override
	public void Sub() {
		// TODO Auto-generated method stub
		System.out.println("I m in side Sub - from infterface1");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("I m in side Mul - from infterface2");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("I m in side Deiv - from infterface2");
	}

}
