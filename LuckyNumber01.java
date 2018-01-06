public class LuckyNumber01 {
    public static void main(String[] args) {
        String date = "15-March-2016";
        System.out.println(getLuckyNumber(date));
    }

    public static int getLuckyNumber(String date) {
    	String[] dateparts=date.split("-");
    	int dd=Integer.parseInt(dateparts[0]);
    	int mm=convertMMMtoMM(dateparts[1]);
        int yy=Integer.parseInt(dateparts[2]);
        
        int sum_Of_Digits = getSumOfDigits(dd);
        sum_Of_Digits+=getSumOfDigits(mm);
        sum_Of_Digits+=getSumOfDigits(yy);
        
        while(sum_Of_Digits>=10)
        	sum_Of_Digits=getSumOfDigits(sum_Of_Digits);
        return sum_Of_Digits;

    	
        
    }

    public static int convertMMMtoMM(String mon) {
   
    	String months="JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
    	mon=mon.substring(0,3);
    	mon=mon.toUpperCase();
    	return((months.indexOf(mon)/3)+1);
         
    }
    
    public static int getSumOfDigits(int num) {
    	int sum=0;
    	while(num>0){
    		sum+=num%10;
    		num=num/10;
    		
    	}
        return sum; 
    }
}