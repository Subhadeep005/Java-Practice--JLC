package Java.util.Practice;

import java.util.*;

public class Lab596 {

	public static void main(String[] args) {
		Properties p=new Properties();
		p.put("JLC-99", "Sri");
		p.put("JLC-88", "Vas");
		p.put("JLC-77", "Dande");
		System.out.println(p);
		Enumeration en=p.propertyNames();
		while(en.hasMoreElements()){
			String pnm=(String) en.nextElement();
			String val=p.getProperty(pnm);
			System.out.println(pnm+"\t"+val);
		}
	}

}
