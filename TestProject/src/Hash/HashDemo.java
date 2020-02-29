package Hash;

import java.util.HashMap;
import java.util.Map;

public class HashDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> obj1 = new HashMap<String, String>();
		obj1.put("400", "Selenium");
		obj1.put("500", "UFT");
		obj1.put("600", "Appium");
		
		//System.out.println(obj1);
		
		for (Map.Entry<String, String> v:obj1.entrySet())
		{
			System.out.println(v);
		}
		
		

	}

}
