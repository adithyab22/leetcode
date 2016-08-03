package easy;
/**
 * Add 2 numbers without using '+'
 * @author Adithya Balasubramanian
 *
 */
public class Sum {
	
	public int getSum(int a, int b) {
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
	//only difference below is (~a)
	public int getSubtract(int a, int b) {
		while (b != 0) {
			int borrow = (~a) & b;
			a = a ^ b;
			b = borrow << 1;
		}
		
		return a;
	}
public static void main(String[] args) {
	System.out.println(3^8);//0011^1000 = 1011
	System.out.println(3&8);//0011&1000 = 0000
}
}
