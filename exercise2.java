package bhavya;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=67;
		int s=0;
		int i;
		for(i=1;i<=num/2;i++){
			if(num%i==0)
				s=s+i;
				
		}
		if(num==s)
			System.out.print("prefect");
		else 
			System.out.println("not perfect");
			
	}
	

}
