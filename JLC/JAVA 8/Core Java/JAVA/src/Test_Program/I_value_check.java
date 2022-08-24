package Test_Program;

public class I_value_check {

	public static void main(String[] args) {
		int i=1, a;
		 i=i++ + i++ + i++; //Last increment not consider. 
		 								//i= 1(then ++) + 2(then ++) + 3(not consider++);   i=1+2+3;  i=6;
		 								//when all three values are assign then it immediate perform operation without checking any further increment 
		 								//after that it  assign the value. 
		// i=i++ + i++ + i;
		// i=i + i++;
		 //a=i++ + i++ + i++;
		 System.out.println(i);
		 //System.out.println(a);
		}
		}
