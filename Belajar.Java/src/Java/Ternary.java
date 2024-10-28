package Java;

import java.util.*;


public class Ternary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String x;
		int input1;
		
		System.out.print("Masukan angka  : ");
		input1 = input.nextInt();
		
		x = (input1 % 2 == 0) ? "genap" : "ganjil";
		
		System.out.printf("angka  %d adalah bilangan %s.", input1 ,x);
	}
}
