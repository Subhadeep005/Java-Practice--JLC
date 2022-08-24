package Java.util.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab640 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		System.out.println(map);
		System.out.println("Size : "+map.size());
		System.out.println("IS EMPTY : "+map.isEmpty());
		map.put("eid", new Integer(99));
		map.put("name", "srinivas");
		map.put("phone", new Long(65799999L));
		map.put("valid", new Boolean(true));
		System.out.println(map);
		System.out.println("size : "+map.size());
		System.out.println("IS EMPTY : "+map.isEmpty() );
	}

}
