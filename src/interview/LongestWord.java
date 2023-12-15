package interview;

public class LongestWord {
	public static void main(String []args) {
		
		String sentence = "Richmond is the capital of Virginia";// 5 s sperators and will create 5 index of array
	System.out.println(findLargestWord(sentence));
	}
	// implementation method
		public static String findLargestWord(String sentence) {// 
			
			String []word = sentence.split(" ");// this method will create array
			String longestWord = "0";
			for(int i = 0;i<word.length;i++) {
				
				if(word[i].length()>longestWord.length()) { // first Richmond will store in word[i]lso on until the largest word 
					
					longestWord = word[i];
		}
		
				
			}
			return longestWord;
		
		/*String sentence = "Richmond kabul Afghanistan";
		System.out.println(getlongestWord(sentence));
	}
		public static String getlongestWord(String message) {
			String word [] = message.split(" ");
			String getLongestWord = " ";
			for(int i = 0;i<word.length;i++) {
				if(word[i].length()>getLongestWord.length()) {
					getLongestWord = word[i];
				}
			}
			return getLongestWord;*/
		/*String sentence = "Tome Allex John";
		
		System.out.println(findlongestWord(sentence));// this method called from line 40 to print the result
	}
		public static String findlongestWord(String input) {// created this method to find the largest word
			
			String [] word = input.split(" ");// base on this spreator space it creates listof array siz 3 line 36
			String getlongestWord = " ";
			for(int i = 0;i< word.length;i++) {// this method gose insid array to iterate it
			if(word[i].length()>getlongestWord.length()) {// mehtod will compare the larges word with or find 
				//getlongestWord:Tome,Allex,John
				getlongestWord = word[i];
				
		}
	
		}
		return getlongestWord;*/
		
	// counting words in the string
     // String countWord = "Afghinstan is peacefull country now";
    //  int count = countWord.split(" ").length;
     // System.out.println(count);
    	 
     }
		}



