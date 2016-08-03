package easy;
/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
Given s = "hello", return "olleh".
 * @author Adithya Balasubramanian
 *
 */
public class ReverseString {
	
	
	
	//O(n) solution: Don't do this
	public String reverseStringOn(String s){
		String result = "";
		for(int i = 0; i < s.length(); i++){
			result += s.charAt(s.length() - i -1);
		}
		
		return result;
	}
	
	//O(n/2) solution : More efficient
	public String reverseString(String s){
		int i = 0;
		int j = s.length() -1;
		
		char[] charArray = s.toCharArray();
		while(i < j){
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		
		return new String(charArray);
	}
	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseString("Hello"));
	}
}
