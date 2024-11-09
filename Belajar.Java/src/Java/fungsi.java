package Java;
import java.util.*;

public class fungsi {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int y, x, z;
		System.out.print("x = ");
		x = input.nextInt();
		System.out.print("y = ");
		y = input.nextInt();
		z = hitung(x, y);
		System.out.printf("maka hasil dari (x + y)*x = (%d + %d)*%d = %d.",x ,y, x, z);
	}
	
	static int hitung (int input, int input1) {
		int hasil = (input + input1) * input;
		
		return hasil;
	}
}
 