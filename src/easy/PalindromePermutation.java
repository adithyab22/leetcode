package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, determine if a permutatoin of the string could be a palindrome
 * @author Adithya Balasubramanian
 *
 */
public class PalindromePermutation {
public static boolean couldBePalindrome(String s){
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	for(int i = 0; i < s.length(); i++){
		if(!(map.containsKey(s.charAt(i)))){
			map.put(s.charAt(i), 1);
		}else{
			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
	}
	int odd = 0; //number of odd occurrences of a char
	//
	for(char c: map.keySet()){
		if(map.get(c)%2 ==1){
			odd++;
		}
		
		if(odd > 1){
			return false;
		}
	}
	return true;
}

public static void main(String[] args) {
	System.out.println(couldBePalindrome("aab"));
	System.out.println(couldBePalindrome("aabb"));
	System.out.println(couldBePalindrome("aaab"));
}
}
