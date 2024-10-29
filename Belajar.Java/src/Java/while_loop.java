package Java;
import java.util.*;

public class while_loop {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int y, a;
		
		System.out.print("masukan jumlah segitiga = ");
		a = input.nextInt();
		
		int x = 1;
		while (x <= a ) {
			y = x;
			while (y <= a) {
				System.out.print(y + ", ");
				y += 1;
			}
			System.out.println();
			x += 1;
		}
		 
	}

}
