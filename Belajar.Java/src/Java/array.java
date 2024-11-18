package Java;
import java.util.Arrays;


public class array {

	public static void main(String[] args) {
		
		
//		tipe data [] nama_array = {};
		int[] array = {1,2,3,4,5};
		
		
//		mengganti nilai array
		array [2] = 5;
		
		System.out.println(Arrays.toString(array)); // menampilkan array tanpa looping
		
//		menampilkan aray dengan looping
		for(int a = 0; a < array.length; a++) {
			System.out.printf("angka ke %d = %d \n", a, array[a]);
		}
		
//		looping khusus collection
		
		for(int b : array) {
			System.out.println("angka saat ini = " + b);
		}

		
	}

}
