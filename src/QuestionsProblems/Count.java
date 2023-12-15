package QuestionsProblems;

import java.util.HashMap;
import java.util.Map;

public class Count {
	public static void main(String[] args) {
		
		// Q 1. count the of vowel chars in a given string?
		//take string, replace all of the chars that are not vowel to nothing
		// so i am left with only the vowel chars
		// then i take the length of that
		
		
		// First Question
		String str = "this is a sample string";
		System.out.println(getVowelCount(str));
		System.out.println(getVowleCount2(str));
		System.out.println(countOcurences(str));
		System.out.println(countVowelOccurences(str));
	}
	public static int getVowelCount(String message) {
		return message.toLowerCase().replaceAll("[^aeiou]","").length();
	}
	
    public static int getVowleCount2(String message2) {
    	int count = 0;
    	message2 = message2.toLowerCase();
    	for (int i = 0; i < message2.length(); i++) {
    		String ms = "" + message2.charAt(i);
			if("aeiou".contains(ms)) {
				count++;
			}
			
		}
    	return count;
    	
    	// Second Question answer
    	//Q 2. count the number of occurances of each every chare in the sstring?
    			//create a map of character and integer
    			// we will look at each character as the key, and the int as the count
    			// go through the cars of the given string, che to so if we have this cahre in the map
    			//if yes, increase the count 
    			// if no, add it to the map, with count of 1
    			// our function then can return the map
    }
    	public static Map<Character, Integer> countOcurences(String messge3){
    		Map<Character, Integer> chars = new HashMap<Character,Integer>();
    		for(char c : messge3.toCharArray()) {
    			// check if the c is in the map char? 
    			if(chars.containsKey(c)) {
    				//if yes, increas the count
    				chars.put(c, chars.get(c)+1);
    			}else {
    				// if no, add to the map with count 1
    				chars.put(c, 1);
    			}
    			// if no, add to the mape with count 1
    			
    		}
    		
    		
    		return chars;
    	}
    
    	//Q 3. count number of occurences of each vowel char?
    			// create a map, use the chare as key and int as value
    			// I would go through the chars of the string
    			// check to see if its a vowel ==="aeiou".contains(the char of that iteration)
    			// I would then check the map to see if i have it in the map
    			// if i have it, then i increase its count
    			// if i dont have it, then i add it to the map and give the count of 1
    			public static Map<Character, Integer> countVowelOccurences(String messeg4){
    				Map<Character, Integer> vowelChars = new HashMap<Character,Integer>();
    				
    				// use the method I have to get the map of count of all of the chars
    				Map<Character, Integer> allChars = countOcurences(messeg4);
    				// i go through the map of all chars with count
    				for(char k :allChars.keySet()) {
    					String key = ""+k;
    					if("aeiouAEIOU".contains(key)) {
    						// if the char, is a vowel, i then add it to the vowelChars map that will ber returned
    						// k = the char of this iteration
    						// allChars = the map of all chars with their count
    						//allChars.get(k)= will give you the count for the char of the iteration
    						vowelChars.put(k,allChars.get(k));
    					}
    				}
    				
    				
    				// return  the map of vowelChars
    				
    				return vowelChars;
    			}
}
