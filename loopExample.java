package bhavya;

public class loopExample {

	public static void main(String[] args) {
		int num=10;
		int a=0,b=1,c=0;
		String series=" ";
		series+=a;
		series+=" "+b;
		for(int i=3;i<=num;i++){
			c=a+b;
			a=b;
			b=c;
			series+=" "+b;
			
		}
		System.out.println(series);

	}

}
