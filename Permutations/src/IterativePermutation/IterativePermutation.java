package IterativePermutation;

import java.util.Scanner;

/*
 * 
 * Print all permutation of String in iterative way?
 * 
 * 
 */

public class IterativePermutation {



	    public static void permuteString(String input) {
	        char[] chars = input.toCharArray();
	        int length = chars.length;
	        int[] indexes = new int[length];

	        System.out.println(input); // Print the original string as the first permutation

	        int i = 0;
	        while (i < length) {
	            if (indexes[i] < i) {
	                if (i % 2 == 0) {
	                    swap(chars, 0, i);
	                } else {
	                    swap(chars, indexes[i], i);
	                }

	                System.out.println(new String(chars));

	                indexes[i]++;
	                i = 0;
	            } else {
	                indexes[i] = 0;
	                i++;
	            }
	        }
	    }

	    private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }

	    public static void main(String[] args) {
	        String input = "efg";
	        permuteString(input);
	    }
	}


