package lc.practice;

public class ReverseInteger {

		public static void main(String[] args){
			ReverseInteger revInt = new ReverseInteger();
			revInt.reverse(-123001);
		}
		public int reverse(int x){
			int remaining_num = x;
			int reverseInt = 0;
			int last_digit;
			while(remaining_num != 0){
				last_digit = remaining_num % 10;
				remaining_num = remaining_num/10;
				reverseInt = reverseInt*10 + last_digit;
				System.out.println(reverseInt+"<--------->"+remaining_num);
			}
			return reverseInt;
			
		}
}
