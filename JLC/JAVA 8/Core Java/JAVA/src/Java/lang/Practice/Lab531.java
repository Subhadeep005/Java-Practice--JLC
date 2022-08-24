package Java.lang.Practice;

import java.io.IOException;

public class Lab531 {

	public static void main(String[] args) throws IOException {
		Runtime rt=Runtime.getRuntime();
		Process p=rt.exec("mspaint");
		
		//OPEN Welcome.txt FILE in NOTEPAD
		String cmds[]={"notepad","E:\\Welcome.txt"};
		Process p2=rt.exec(cmds);
		
		//For windows 7 onwards:
		String cmds1[]={"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","http://www.jlcindia.com"}; 
		Process p3=rt.exec(cmds1);
		System.out.println("Press Enter to close all process");
		System.in.read();
		p.destroy();
		p2.destroy();
		p3.destroy();
		System.out.println("Main Completed");
	}

}
