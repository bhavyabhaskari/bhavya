public class OddPalindromes01 {
    public static void main(String[] args) {
        int num1 = 1500;
        int num2 = 2000;
        System.out.println(generateOddPalindromes(num1, num2));
    }

    public static String generateOddPalindromes(int start, int limit) {
       String result="";
    	for(int num=start;num<=limit;num++){
    		if(isAllDigitsOdd(num)){
    			if(isPalindrome(num))
    				result += num+",";
    				
    		}
        	
        }
    	if(result.length()==0)
    	    return "-3";
    	if(start>=limit)
    		return "-2";
    	
    	
    	else
    		
    	return result.substring(0,result.length()-1);
    }

    public static boolean isPalindrome(int num) {
         if(num==reverse(num))
              return true;
         else
        	 return false;
    }

    public static int reverse(int num) {
       int d;
       int rev=0;
    	 while(num>0){
			  d=num%10;
			  rev=rev*10+d;
			  num=num/10;
    	 }
    	 return rev;
    }
    

    public static boolean isAllDigitsOdd(int num) {
       int digit;
       while(num>0){
    	   digit=num%10;
    	   if(digit%2==0 && digit!=0)
    		   return false;
    	   num=num/10;
       }
    	return true;   
    }
}