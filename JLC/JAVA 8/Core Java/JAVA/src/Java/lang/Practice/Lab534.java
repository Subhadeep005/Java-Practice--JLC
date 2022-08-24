package Java.lang.Practice;

import java.math.*;

public class Lab534 {

	public static void main(String[] args) {
		BigInteger bint1=new BigInteger("100");
		System.out.println(bint1.bitCount()); //Number of one bit
		System.out.println(bint1.bitLength()); //Number of Total bits allocated
		long val=9223372036854775807L; //MAX VALUE\
		long val2=100;
		long res=val+val2;
		System.out.println(res);
	}

}
