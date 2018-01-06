package bhavya;

public class stringDemo {

	public static void main(String[] args) {
		String name="Amar akbar Antony Tommy";
		String[] nameParts=name.split(" ");
		
		for(int i=0;i<nameParts.length;i++)
			System.out.println(nameParts[i]);
		
		char c='A';
		int letter=c;
		/*
		int indexOfFirstSpace=name.indexOf(" ");
		int indexOfSecondSpace=name.lastIndexOf(" ");
	
		System.out.println(name.charAt(5));
		System.out.println(name.length());
		System.out.println(name.indexOf(32));
		System.out.println(name.substring(2));
		System.out.println(name.substring(0,indexOfFirstSpace));
		System.out.println(name.substring(indexOfFirstSpace,indexOfSecondSpace));
		System.out.println(name.substring(indexOfSecondSpace+1));
		System.out.println(name.lastIndexOf(" "));
		System.out.println(name.split(" "));
		*/
	}

}
