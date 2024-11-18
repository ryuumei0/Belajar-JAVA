package Java;
import java.util.Arrays;


public class array_multi_dimensi {

	public static void main(String[] args) {
		int [][] aray = new int [5][4];
		printarray(aray);
		
		String [][] array = {
				{"aray", "ayam","ikan"},
				{"opang","kerupuk","opok"}
		};
		printarraystring(array);
	}
	
	private static void printarray(int[][] data) {
		for(int a = 0; a < data.length; a++) {
			System.out.println(Arrays.toString(data[a]));
			//dengan foreach
			for(int [] baris : data) {
				for(int angka : baris) {
					System.out.println(angka);
		}
			}
		}}
	private static void printarraystring(String[][] data) {
		
		for(int a = 0; a < data.length; a++) {
			System.out.println(Arrays.toString(data[a]));
		}
//		dengan looping manual
		for(int a = 0; a < data.length; a++) {
			for(int i = 0;i < data[a].length;i++) {
				System.out.print(data[a][i] + ", ");
			}
			System.out.println();
		}
		
			}
		}
	}
}
