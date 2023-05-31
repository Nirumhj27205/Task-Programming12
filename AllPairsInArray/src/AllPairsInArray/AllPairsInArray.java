package AllPairsInArray;

/*
 * 
 * Find all pairs in an array whose sum is equal the given number
 * 
 * e.g 
 * array[] = {1,5,4,6,-5,3,8}
 *  sum = 9
 *  
 *  
 */


public class AllPairsInArray {

	public static void main(String[] args) {
		
		int array[] = {1,5,4,6,-2,3,8};
		int sum = 9;
		findAllPairs(array, sum);
		
		
	}

	private static void findAllPairs(int[] array, int sum) {
		// TODO Auto-generated method stub
		for(int i=0; i < array.length; i++) {
			
			for(int j=i+1; j< array.length; j++) {
				if(array[i] + array[j] == sum) {
					System.out.println("The pair of array whose sum is equal to the given number is :");
					
					System.out.println(array[i] +" + "+array[j] +" = " + sum);
				}
			}
		}
	}
}
