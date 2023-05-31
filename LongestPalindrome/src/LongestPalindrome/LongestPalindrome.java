package LongestPalindrome;

import java.util.Scanner;

/*
 * 
 * Write a function to find out the longest palindrome in a given string?
 * 
 */

public class LongestPalindrome {
	
	
	//basic for accepting input
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String inputString = scanner.nextLine();
		
		System.out.println("The longest Palindrome is "+LongestPalindrome.getLongestPlaindrome(inputString));
		scanner.close();
		
	}
	
	//function that accepts user inputs
	public static String getLongestPlaindrome(String inputString) {
	
		//validation check if empty or not
		
		if(inputString.isEmpty())
			return "Enter proper String";
		
		//if length is 1
		if(inputString.length() == 1 )
			return inputString;
		
		//to get first character 0-1
		String longest = inputString.substring(0,1);
		
		//Program for checking the string
		//check for every character so used for loop
		//inputString().length for last string
		for(int i = 0; i < inputString.length(); i++) {
			
			//odd checking
			String tempValue = checkEquality(inputString,i,i);
			
				if(longest.length() < tempValue.length()) {
					longest = tempValue;
				}
				
				//even checking
				//i+1 for even characters
				tempValue = checkEquality(inputString, i, i+1);
				
				if(longest.length() < tempValue.length()) {
					longest = tempValue;
				}
				
		}
		return longest;  //longest store in longestPalindrome
		
	}
	
	
	//Equality check
	public static String checkEquality(String inputString, int beginString, int endString) {
		
		//checking the equality
		//beginString index should always be greater than 0 and endString index should not go beyond last length
		//both character should be same
		while(beginString >=0 && endString <=inputString.length() - 1 && inputString.charAt(beginString)== inputString.charAt(endString)) {
			
			beginString--;
			endString++;
			
		}
		
		return inputString.substring(beginString+1, endString);
		
	}
	
	
	
	
}
