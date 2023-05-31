package MissingNumber;

import java.util.HashSet;

/*
 * 
 * Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
 * 
 */

public class MissingNumber {
	
	public static void main(String[] args) {
		
		//two arrays
		int array1[] = {1,2,3,4,5};
		int array2[] = {2,3,1,0,5,4};
		
		int missingNumber = findMissingNumber(array1, array2);
		
		System.out.println("The number that is not present in the second array is: "+ missingNumber);
	}
	
	public static int findMissingNumber(int[] array1, int[] array2) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : array2) {
			set.add(num);
		}
		
		for(int num : array1) {
			if(!set.contains(num)) {
				return num;
			}
		}
		
		return -1; 
		
	}

}
