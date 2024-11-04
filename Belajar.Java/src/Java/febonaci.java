package Java;
import java.util.*;

public class febonaci {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int a,fb, c, d, e;
		
		c = 0;
		fb = 1;
		d = 1;
		System.out.println("masukan panjang deret fibonacci = ");
		a = input.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println("deret ke-"+ i + " = "+ fb);
			fb = d + c;
			c = d;
			d = fb;
		}

		c = 0;
		fb = 1;
		d = 1;
		System.out.println("masukan angka yang dicari = ");
		e = input.nextInt();

		for(int i = 1; i <= a; i++) {
			fb = d + c;
			c = d;
			d = fb;
			if (e == fb ) {
				System.out.println("angka yang anda cari ada di deret ke = " + i);
				break;
			}
		}
		
	}
}
