package Abstract;

public class HR extends ITDept{

	public static void main(String[] args) {
		//HR obj1 = new HR();
		//obj1.Goodies();
		//obj1.Work();
		//obj1.Salary();
		//obj1.Bonus();
		
		ITDept obj2 = new HR();
		obj2.Goodies();
		obj2.Work();
		obj2.Salary();
		
		
		
	}
	
	private void Bonus() {
		System.out.println("Lets get him a bonus");
	}

	@Override
	public void Salary() {
		// TODO Auto-generated method stub
		System.out.println("This from IT Dept");
	}

}
