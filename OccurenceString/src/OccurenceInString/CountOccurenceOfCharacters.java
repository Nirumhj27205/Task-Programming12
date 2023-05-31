package OccurenceInString;

import java.util.HashMap;
import java.util.Scanner;


/*
 * 
 * Count the occurence of a given character in a string
 *
 *
 *Hashmap is a part of collection of data in a key value form
 *
 *key = character value = it's occurence counts
 */




public class CountOccurenceOfCharacters {

	public static void main(String[] args) { 
		
		//hashmap saying {s=2, r=5, u=6, t=0}
		
		String string = "Programming";

		
		//temporary variables
		//initial value
		int count ;
		char ch;
		
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			if(hashMap.containsKey(ch)) {
				count = hashMap.get(ch);
				count ++;
				hashMap.replace(ch, count);
			}
			else {
				hashMap.put(ch,  1);
			}
		}
		
		//find all keySet
		for(Character key : hashMap.keySet()) {
			System.out.println(key+"  = "+hashMap.get(key));
			
		}
		
		
	}
}
