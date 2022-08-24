package Test_Program;

import java.util.Arrays;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int arr[]= {4,7,8,10,45,36,1,5,3};
		System.out.println(FindSecondHighest.findSecondHighset(arr));

	}

}

class FindSecondHighest {
	public static int findSecondHighset(int arr[]) {
		Arrays.sort(arr);
		return (arr[arr.length-2]);
	}
	
}