package lc.practice;

public class PalindromeFinder {
	public static void main (String[] args){
		PalindromeFinder palindromeFinder =  new PalindromeFinder();
		palindromeFinder.isPalindrome(-1214);
	}
	public boolean isPalindrome(int x) {
        
        int remaining_num = x;
		int reverseInt = 0;
		int last_digit;
		while(remaining_num != 0){
			last_digit = remaining_num % 10;
			remaining_num = remaining_num/10;
			reverseInt = reverseInt*10 + last_digit;
		}
		if (reverseInt == x){
			return true;
		}else{
			return false;
		}
    }
}
