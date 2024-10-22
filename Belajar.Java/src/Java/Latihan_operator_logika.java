package Java;
import java.util.Scanner;

public class Latihan_operator_logika {
	
	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	boolean hasil;
	
	System.out.print("masukang angkalebih dari 2 dan kurang dari 10 = ");
	int a = userInput.nextInt();
	
	hasil = (a > 2) && (a < 10);
	System.out.println("apakah sesuai ? " + hasil);
	}
}
 