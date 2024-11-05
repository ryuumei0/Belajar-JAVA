package Java;
import java.util.*;

public class persegi{

	public static void main(String[] args) {
//		ini adalah persegi panjang
		Scanner input = new Scanner(System.in);
		int panjang, lebar, sisi, sgt, bagi, c;
		
		System.out.print("masukan panjang = ");
		panjang = input.nextInt();
		
		System.out.print("masukan lebar = ");
		lebar = input.nextInt();
		
		for(int a = 1; a <= lebar; a++){
			for(int b = 1; b <= panjang; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.print("masukan sisi = ");
		sisi = input.nextInt();
		
		for(int a = 1; a <= sisi; a++){
			for(int b = 1; b <= sisi; b++) {
				System.out.print("* ");
			}
			System.out.println();
//		}
	
}
	}
}
