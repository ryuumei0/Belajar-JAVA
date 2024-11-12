package Java;
import java.util.*;

public class overloadmethod {

//	menggunakan satu nama funsi untuk banyak tipe argumen
	public static void main(String[] args) {
		angka(16.7f);

	}
	
	private static void angka(float n) {
		System.out.println("angka = " + n);

	}
	
	private static void angka(int n) {
		System.out.println("angka = " + n);
		
	}

}
