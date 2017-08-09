package lc.practice;

public class ReverseInteger {

		public static void main(String[] args){
			ReverseInteger revInt = new ReverseInteger();
			revInt.reverse(Integer.MAX_VALUE );
		}
		public int reverse(int x){
			int remaining_num = x;
			int reverseInt = 0;
			int last_digit;
			try{
				while(remaining_num != 0){
					last_digit = remaining_num % 10;
					remaining_num = remaining_num/10;
					reverseInt = Math.addExact(Math.multiplyExact(reverseInt,10), last_digit);
				}
				return reverseInt;
			}catch(ArithmeticException  Ex){
				return 0;
			}
			
		}
}
