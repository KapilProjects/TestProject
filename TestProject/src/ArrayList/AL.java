package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AL {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(2432342);
		obj1.add("myname is khan");
		obj1.add(23.23);		
		obj1.add("M");
		
		for (Object v:obj1)
		{
			System.out.println(v);
		}
		
		Iterator itr = obj1.iterator();		
		while(itr.hasNext())
		{
			Object val = itr.next();
			System.out.println(val);
		}

	}

}
