package Java;

import java.util.Scanner;

public class fungsi_void {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x, y;
		String pil, pil1;
		
		do {
			System.out.printf("======= pilihan ===== \n1. hitung luas segitiga.\n2. menghitung luas persegi\n3. membuat segitiga siku.\n4. membuat persegi.\n5.membuat persegi panjang.\n6. membuat luas persegi panjang.\nMasukan pilihan anda (1-6) =  ");
			pil1 = input.next();
			switch(pil1) {
				case "1" :
					System.out.print("masukan nilai alas  = ");
					y = input.nextInt();
					System.out.print("masukan nilai tinggi  = ");
					x = input.nextInt();
					segitiga(y,x);
					break;
					
				case "2" :
					System.out.print("masukan nilai sisi  = ");
					y = input.nextInt();
					persegi(y);
					break;
					
				case "3" :
					System.out.print("masukan nilai banyak baris  = ");
					y = input.nextInt();
					segitiga1(y);
					break;
					
				case "4" :
					System.out.print("masukan nilai banyak baris  = ");
					y = input.nextInt();
					persegi1(y);
					break;
					
				case "5" :
					System.out.print("masukan nilai panjang  = ");
					y = input.nextInt();
					System.out.print("masukan nilai lebar  = ");
					x = input.nextInt();
					ppanjang(y,x);
					break;
					
				case "6" :
					System.out.print("masukan nilai panjang  = ");
					y = input.nextInt();
					System.out.print("masukan nilai lebar  = ");
					x = input.nextInt();
					ppanjang1(y,x);
					break;
				
				default : 
					System.out.println("masukan angka yang benar.");
					break;
			}
			System.out.print("lanjjut(y/n) = ");
			pil = input.next();
		}while(pil == "y");
	}
	
	private static void segitiga(int alas, int tinggi) {
		float hasil = (float) 0.5 * (alas * tinggi);
		
		System.out.printf("luas dari segitiga= %f\n",hasil );
	}
	
	private static void ppanjang1(int panjang, int lebar) {
		int hasil = panjang * lebar;
		
		System.out.printf("luas dari segitiga= %d\n",hasil );
	}
	private static void persegi(int sisi) {
		
		int hasil = sisi*sisi*sisi*sisi;
		System.out.printf("luas persegi = %d\n",hasil );
		
	}
		
	private static void segitiga1(int a) {
		for(int b = 1; b  <= a; b++) {
			for(int c = 1; c <= b; c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void persegi1(int a) {
		for(int b = 1; b  <= a; b++) {
			for(int c = 1; c <= a; c++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void ppanjang(int panjang, int lebar) {
		for(int b = 1; b  <= lebar; b++) {
			for(int c = 1; c <= panjang; c++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
