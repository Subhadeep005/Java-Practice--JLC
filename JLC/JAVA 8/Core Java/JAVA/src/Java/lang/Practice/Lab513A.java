package Java.lang.Practice;

public class Lab513A {

	public static void main(String[] args) {
		int a=123, b=321;
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.hashCode(b));
		System.out.println(Integer.bitCount(a));
		System.out.println(Integer.compare(1, 2));
		System.out.println(Integer.compareUnsigned(1, 2));
		System.out.println(Integer.divideUnsigned(4, 2));
		System.out.println(Integer.highestOneBit(a));
		System.out.println(Integer.lowestOneBit(a));
		System.out.println(Integer.max(a, b));
		System.out.println(Integer.min(a, b));
		System.out.println(Integer.numberOfLeadingZeros(a));
		System.out.println(Integer.numberOfTrailingZeros(a));
		System.out.println(Integer.remainderUnsigned(4, 2));
		System.out.println(Integer.reverse(b));
		System.out.println(Integer.reverseBytes(a));
		System.out.println(Integer.rotateLeft(b, 1));
		System.out.println(Integer.rotateRight(b, 1));
		System.out.println(Integer.signum(b));
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toString(a));
	}

}
