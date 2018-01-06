
public class SumOfDigits01 {

	public static void main(String[] args) {
		int num=54;
		int sum =getSumOfDigits(num);
		System.out.println(sum);
	}
	public static int getSumOfDigits(int num){
	int d1;
	int d2;
	int sum;
	if(num>=10 && num<100){
		d1=num%10;
		d2=num/10;
		sum=d1+d2;
		return sum;
	}
	else{
		return 0;
	}
}

	
	
}
