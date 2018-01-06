package bhavya;

public class OddPalindrome {

	public static void main(String[] args) {
		int number=5335;
		int reverse;
		if(CheckAllDigitsOdd(number)){
			reverse=reverse(number);
			if(checkPalindrome(number,reverse))
				System.out.println("number is odd palindrome");	
			else
				System.out.println("number is not odd palindrome");
		}
			else
			{
			System.out.println("number is not odd palindrome");
		}
	}
	public static boolean CheckAllDigitsOdd(int number){
		int digit;
		int count=0;
		
		while(number>0){
			digit=number%10;
			number=number/10;
		     if(digit %2 ==0)
		    	count++;
		   }
		if(count==0)
			return true;
		else
			return false;
		}
	public static int reverse(int number){
		int digit;
		int reverse=0;
		while(number>0){
			digit=number % 10;
			number=number/10;
			reverse=10*reverse+digit;
		}
		return reverse;
	}
	public static boolean checkPalindrome(int number,int reverse){
		if(number==reverse)
			return true;
		else 
			return false;
		}
}

