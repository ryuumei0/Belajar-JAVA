package Java;
import java.util.Arrays;


public class latihan_array {
	public static void main(String[] args) {

		//		menjumlahhan antar 2 array
		int [] array = {1, 3, 5, 7 ,3 , 7, 4, 8, 4};
		int [] array1 = {3, 1, 4, 2 ,4 , 6, 4, 7,9 };
		int [] hasil = new int[9];
		
		for(int a = 0; a < array.length; a++ ) {
			hasil[a] = array[a] + array1[a];
		}
		printarray(hasil, "hasil");
		
//		menggabungkan 2 array
		int [] hasil2 = new int [array.length + array.length];
		
		for(int i = 0; i < array.length; i++) {
			hasil2[i] = array[i];
		}
		for(int i = 1; i <array1.length; i++) {
			hasil2[i + array.length] = array[i];
		}
		printarray(hasil2,"hasil2");
		
	}
	public static void printarray(int [] array, String massage) {
		System.out.println(massage + " = " + Arrays.toString(array));
	}
}
