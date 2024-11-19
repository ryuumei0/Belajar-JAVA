package Java;
import java.util.arrays;

public class next_array_multidimensi {

	public static void main(String[] args) {
		
		int [][] array_2d = {
				{1,2,3},
				{4, 5, 6},
		};
		
		printarray(array_2d);
 
	}
	
	private static void printarray(int[][]data) {
		for(int i = 0; i < data.length;i++) {
			System.out.print("{");
			for(int j = 0; j < data[i].length;j++) {
				System.out.print(data[i][j]);
			}
			System.out.print("}");
			System.out.println();
		}
		
	}

}
