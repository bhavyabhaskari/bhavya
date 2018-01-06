package bhavya;

public class matrix {

	public static void main(String[] args) {
		
		int[][] coordinates={{10,5,2},{2,9,10},{12,15,90}};
		for(int rows=0;rows<=2;rows++){
			for( int cols=0;cols<=2;cols++){
				System.out.print(coordinates[rows][cols]+" ");
			}
			System.out.println();
		}

	}

}
