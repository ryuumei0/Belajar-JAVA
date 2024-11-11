package Java;
import java.util.*;

public class rekursiv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukan nilai = ");
		int x = input.nextInt();
		int hasil = faktorial(x);
		System.out.println("jumlah = " + hasil);
		
	}
	private static int faktorial(int nilai) {
		System.out.println(nilai);
		
		if (nilai == 1 ) {
			return nilai;
		}
		
		return nilai * faktorial(nilai - 1);
		
	}

}
