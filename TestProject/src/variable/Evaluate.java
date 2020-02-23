package variable;

public class Evaluate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Calculation obj1 = new Calculation();
		//Addition
		result = obj1.addition(4, 5);
		System.out.println(result);
		//Subtraction
		result = obj1.subtraction(4, 5);
		System.out.println(result);
		
		result = obj1.multiplication(4, 5);
		System.out.println(result);

	}

}
