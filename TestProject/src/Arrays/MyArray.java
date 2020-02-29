package Arrays;



import Parameters.Calculation;


public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student[] = new int[5];
		student[0] = 23;
		student[1] = 45;
		student[2] = 76;
		student[3] = 12;
		student[4] = 83;
		
		int arrLen = student.length;
		
		System.out.println(arrLen);
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Each student number is:"+student[i]);
		}

		MyArray ob1 = new MyArray();
		ob1.Check();
	}
	
	public void Check()
	{
		float sRes;		
		Calculation obj2 = new Calculation();
		sRes = obj2.divide(5, 2);
		System.out.println(sRes);		
		
	}

}
