public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] strArray= {
		            "C# program compilation/ltgDdukzQ7I/18:47",
		            "C# data types/L_gFuuSp4V0/17:53",
		            "C# class/l1C4FZGCab0/10:48",
		            "C# class as virtual entity/HSdIq3k51bg/9:15",
		            "Objects in c#/SM_QqUdMXY0/22:14",
		            "Debugging in visual studio/8hXH5HxQfFU/10:41",
		            "C# Arrays/CLnA6OAlNPk/24:50",
		            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
		            "Arrays Assignment/Zt85ireWQWw/7:49",
		            "Loops/u_k75WcEpHM/5:51"};
		
		 
	 StringBuffer sbf = new StringBuffer();
		 
	        sbf.append(strArray[0]);
		   for(int i=1; i < strArray.length; i++){
               sbf.append(" /").append(strArray[i]);
       }
      
       String str=sbf.toString();
       
       StringTokenizer tkns = new StringTokenizer(str,"/");
       
       String name= tkns.nextToken();
       String id= tkns.nextToken();
       String time= tkns.nextToken();
      
		 System.out.println("name :"+name);
		 System.out.println("id :"+id);
		 System.out.println("time :"+time);

	}



