package Java.lang.Practice;

import java.util.*;

public class Lab529 {

	public static void main(String[] args) {
		System.out.println("*****ACCESSING ALL PROPERTIES*****");
		Properties p=System.getProperties();
		Enumeration enm=p.propertyNames();
		while(enm.hasMoreElements()){
			String pName=enm.nextElement().toString();
			String val=System.getProperty(pName);
			System.out.println(pName+"\t:\t"+val);
		}
	}
}
