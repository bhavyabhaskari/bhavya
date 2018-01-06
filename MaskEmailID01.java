
public class MaskEmailID01 {
    public static void main(String[] args) {
        
    	String email="johndoe@gmail.com";
    	String maskEmail="";
    	for(int i=0;i<email.length();i++){
    		if(i>=2 && i<email.indexOf('@'))
    			maskEmail=maskEmail+'X';
    		else
    			maskEmail=maskEmail+email.charAt(i);
    		
    	}
    	System.out.println(maskEmail);
    	
    		
    	/*
    	int index=str.indexOf("@");
    	for(int i=2;i<=index;i++){
    		
    }
    System.out.println();
    
    		
    	String email = "testmail@.mailme.com";
        System.out.println(String.replace());
        
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
        */
    }

}