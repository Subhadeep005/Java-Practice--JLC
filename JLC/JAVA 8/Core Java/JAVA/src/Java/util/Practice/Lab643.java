package Java.util.Practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab643 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", new Long(65799999L));
		System.out.println("\n**KEYS");
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()){
			Object key = it.next();
			System.out.println(key);
		}
		System.out.println("\n**VALUES");
		Collection values = map.values();
		Iterator it1 = values.iterator();
		while(it1.hasNext()){
			Object value = it1.next();
			System.out.println(value);
		}
	}

}
