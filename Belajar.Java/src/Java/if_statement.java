package Java;
import java.util.*;


public class if_statement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int angka;
		
		System.out.print("masukan angka = ");
		angka = input.nextInt();
		
		if (angka % 2 == 0) {
			System.out.printf("%d adalah bilangan genap.", angka);
		}else {
			System.out.printf("%d adalah bilangan ganjil.", angka);
		}
	}
	
	
	
}
