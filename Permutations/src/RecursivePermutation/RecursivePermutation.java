	package RecursivePermutation;
	
	import java.io.*;
	import java.util.*;
	
	/*
	 * 
	 * find out all permutations(take any string) in recursion way
	 * 
	 */
	
	public class RecursivePermutation {
	
		public static void permutation(String input) {
			permutation("", input);
		}
	
		private static void permutation(String recurperm, String word) {
			if(word.isEmpty()) {
				System.out.println(recurperm+word);
			}
			else {
				for(int i=0; i<word.length(); i++) {
					permutation(recurperm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
				}
			}
		}
		
		public static void main(String[] args) {
			permutation("abc");
		}
	}
