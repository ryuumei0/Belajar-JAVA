package Java;
import java.util.*;

public class if_else_statemen {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int suhu;
		System.out.println("============ Status Cuaca =============");
		System.out.print("masukan suhu = ");
		suhu = input.nextInt();
		
		if (suhu < 15 ) {
			System.out.printf("suhu saat ini dingin.");
		} else if (suhu >= 15) {
			System.out.println("suhu saat ini sejuk.");
		}else if(suhu <= 25) {
			System.out.println("suhu saat ini hangat.");
		}else if (suhu >= 35 ) {
			System.out.println("suhu saat ini panas.");
		}
	}
}
