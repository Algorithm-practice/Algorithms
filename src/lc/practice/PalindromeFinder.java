package lc.practice;

public class PalindromeFinder {
	public static void main (String[] args){
		PalindromeFinder palindromeFinder =  new PalindromeFinder();
		palindromeFinder.isPalindrome(-2147447412);
	}
	public boolean isPalindrome(int x) {
		
        if(x!= Math.abs(x)){
        	return false;
        }
        int remaining_num = x;
		int reverseInt = 0;
		int last_digit;
		try{
		while(remaining_num != 0){
			last_digit = remaining_num % 10;
			remaining_num = remaining_num/10;
			reverseInt = Math.addExact(Math.multiplyExact(reverseInt,10), last_digit);
		}
		if (reverseInt == x){
			return true;
		}else{
			return false;
		}
		}catch(Exception ex){
			return false;
		}
    }
}
