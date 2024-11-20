package Java;
import java.util.*;
import java.lang.String;

public class operasi_string {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		String kalimat = "saya adalah manusia ikan";
		
		
		//substring
		System.out.println("=====substring=====");
		String kata = kalimat.substring(12, 23);
		System.out.println(kata);
		
		//concanitation (concat)
		System.out.println("=====concat=====");
		String  kaliat2 = kata + " sapu sapu";
		System.out.println(kaliat2);
		
		kata = kata + " paus";
		
		//lowercase dan uppercase
		System.out.println("=====upper dan lower cast=====");
		
		System.out.println(kalimat.toUpperCase());
		System.out.println(kalimat.toLowerCase());
		
		//replace
		System.out.println("==== replace =====");
		kata = kalimat.replace("ikan", "ayam");
		System.out.print(kata);
		
		//komparasi
		System.out.println();
		String mobil1 = "honda";
		String mobil2 = "suzuki";
		
		System.out.println(mobil1.compareTo(mobil2));//jarak antara huruf awal (s ==> h)
		System.out.println(mobil2.compareTo(mobil1));//jarak anatar huruf awal

		//persamaan
		System.out.println("==== persamaan =====");
//		String katainput = "test"; // ini ada di string pool
		String katakata = new String("test");//berbeda string pool
		String katainput2 = "test";// ini juga
		
		if(katakata == katainput2) {
			System.out.println("sama");
		}else {
			System.out.println("tidak sama");
		}
		
		System.out.print("ini adalah input user = ");
		katainput2 = input.next();
		
		System.out.println("input = " + katainput2);
		
		//dengan .equals
		
		if(katainput2.equals(katakata)) {
			System.out.println("sama");
		}else {
			System.out.println("tidak sama");
		}
		
	}
	
	
	

}
