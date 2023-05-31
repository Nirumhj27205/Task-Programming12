package MissingNumberInArray;

/*
 * 
 * In an array 1-100 numbers are stored, one number is missing how do you find it
 * 
 */

public class MissingNumberInArray {

		public static void main(String[] args) {
	
		//array should not have duplicates
		//array no need to be in sorted order either asc or desecnding
		//value should be in proper range i.e 1,2,3,4,5 or 5,4,3,2,1
		
			int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,96,97,98,99,100};
			
			//we have to sum except the missing number  1+2+3+5  sum1
			//we have to sum all the numbers including missing number  1+2+3+4+5 sum2
			//sum2 - sum1 = missing number
			
			int sum1 = 0;
			
			//to get index
			for(int i=0; i<num.length; i++) {
				sum1 = sum1 + num[i];
			}
			
			System.out.println("Sum of elements in array is :"+ sum1);
			
			int sum2 = 0;
			
			//to get the number
			for(int i=1; i<=100; i++) {
				sum2 = sum2 + i;
			}
			
			System.out.println("Sum of range of elements in array:"+ sum2);
			
			System.out.println("Missing number is "+ (sum2-sum1));
			
			//95 is missing
			
	
	}
}
	

