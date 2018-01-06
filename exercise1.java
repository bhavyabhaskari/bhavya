package bhavya;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=34567;
		int d;
		int r=0;
		while(number>0){
			d=number%10;
			r=r*10+d;
			number=number/10;
			
		}
   System.out.println(r);
	}

}
