package Java;

import java.util.Scanner;

public class input {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
//		 membuat program menghitung luas persegi panjang
		
		int panjang, lebar, luas;
		
		System.out.print("masukan panjang = ");
		panjang = userInput.nextInt();

		System.out.print("masukan lebar = ");
		lebar = userInput.nextInt();		
		
		luas = panjang * lebar;
		
		System.out.printf("Luas = %d * %d = %d", panjang ,lebar ,luas);
	}

} 
