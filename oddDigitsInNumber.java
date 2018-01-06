package bhavya;

public class oddDigitsInNumber {

	public static void main(String[] args) {
		int num=1221;
		int flag=0;
		int digit;
		while(num>0){
		
			digit=num%10;
			num=num/10;
			
		if(digit%2==0)
			flag=0;
		else
			flag=1;
		}

		if(flag==0)
			System.out.println("all digits are  odd");
		else
			System.out.println("all digits are not odd");
		
			
	}

}
