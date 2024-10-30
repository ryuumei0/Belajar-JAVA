package Java;
import java.util.*;

public class while_loop {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int y, a, z, b;
		
		b = 1;
		System.out.print("masukan jumlah segitiga = ");
		a = input.nextInt();
		
		int x = 1;
		while (x <= a ) {
			y = 1;
			while (y <= x) {
				System.out.print(y + ", ");
				y += 1;
			}
			System.out.println();
			x += 1;
		}
		 x = 1;
		while (a >= x ) {
			y = a;
			while (y >= x) {
				System.out.print(y + ", ");
				y -= 1;
			}
			System.out.println();
			a -= 1;
		}
	}

}
