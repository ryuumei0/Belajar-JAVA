package Java;
import java.util.*;

public class operasi_array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[ ] array = {1, 3, 4, 5, 7}; 
		int [] array1 = new int [5];
		
		
//		mmerubah array menjadi string
		System.out.printf("============== merubah menjadi string ============\n");
		arrays(array);
		
//		mengkopi array
		System.out.printf("============== mengkopi array ============\n");
		for (int a = 0; a < array.length; a++) {
			array1[a] = array[a];
		}
		System.out.println(array);
		arrays(array);
		System.out.println(array1);
		arrays(array1);
		
//		mengkopi dengan copyof
		System.out.printf("============== mengkopi array dengan copyof ============\n");
		int [] array2 = Arrays.copyOf(array, 5);
		System.out.println(array2);
		arrays(array2);
		
//		mengkopi dengan copyofrange
		System.out.printf("============== mengkopi array dengan copyofrange ============\n");
		int [] array3 = Arrays.copyOfRange(array, 0, 5);
		System.out.println(array3);
		arrays(array3);
		
//		fill array
		System.out.printf("============== fill array ============\n");
		int [] array4 = new int [10];
		arrays(array4);
		Arrays.fill(array4, 2);//mengisi array dengan jumlah yang sama
		arrays(array4);
		
//		komparasi array
		System.out.printf("============== komparasi array array ============\n");
		//menggunakan if
		arrays(array);
		arrays(array1);
		String hasil = (array == array1)?"sama" : "tidak sama";
		System.out.println(hasil);
		//mengguakan ".equals"
		hasil = (Arrays.equals(array, array1))?"sama" : "tidak sama";
		System.out.println(hasil);
		
//		mencari array yang lebih besar
		int [] array5 = {1, 2, 3, 6, 5};
		int [] array6 = {1, 2, 7, 4, 5};
		System.out.printf("============== mencari array yang lebih besar ============\n");
		System.out.println(Arrays.compare(array5, array6));
		
//		mencari indeks array yang berbeda  
		System.out.printf("============== mencari indeks array yang berbeda ============\n");
		System.out.println(Arrays.mismatch(array5, array6));
		
//		sort array
		System.out.printf("============== Sort array ============\n");
		int[] array8 = {1, 5, 3, 4, 2, 9, 11, 2,};
		arrays(array8);
		Arrays.sort(array8);
		arrays(array8);
		
// 		search indeks array
		System.out.printf("============== Search array ============\n");
		int angka = 9;
		int posisi = Arrays.binarySearch(array8, angka);
		
		System.out.printf("indeks %d ada di indeks ke %d", angka, posisi);
	}
	private static void arrays(int[] array) {
		System.out.println("array = " + Arrays.toString(array));
	}
}