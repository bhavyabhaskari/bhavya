package bhavya;

public class multipleOfTenArray {

	public static void main(String[] args) {
		int[] arr={12,10,23,54,60};
		for(int i=0;i<arr.length;i++)
		if(arr[i]%10==0)
		
			System.out.println(arr[i]);
		else
			System.out.println((arr[i]/10+1)*10);
				

	}

}
