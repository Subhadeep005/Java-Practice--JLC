package Java.util.Practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab644 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", new Long(65799999L));
		map.put("valid", new Boolean(true));
		System.out.println("***KEYS AND VALUES***");
		Set data = map.entrySet();
		Iterator it = data.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			Map.Entry entry =(Map.Entry)obj;
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key +"\t\t" + value);
		}
	}

}
