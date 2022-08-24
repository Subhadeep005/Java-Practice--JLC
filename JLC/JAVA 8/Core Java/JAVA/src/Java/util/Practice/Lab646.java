package Java.util.Practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab646 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("sid", "JLC-099");
		map.put("name", "Sri");
		map.put("email", "sri@jlc.com");
		map.put("phone", new Long(65799999L));
		map.put("add", "Mathikere");
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
	}
	}
}
