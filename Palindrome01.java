
public class Palindrome01 {

	public static void main(String[] args) {
		 int num = 878;
	        System.out.println(isPalindrome(num));
	    }

	    public static int isPalindrome(int num) {
	    	int d1;
	    	int d2;
	    	if(num>99 && num<1000){

	    		d1=num%10;
	    	d2=num/100;
	    	if(d1==d2)
	    		return 1;
	    		
	    	
	    	else
	    		return 0;
	    	}
	    		
	    		else 
	    			return -1;
	    	}

	    	}
	    	
	    
	    


