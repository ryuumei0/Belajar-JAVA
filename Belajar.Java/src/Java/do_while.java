package Java;
import java.util.*;

public class do_while {
	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		
//		do{
//			aksi
//		}while(kondisi);
		
		do {
			System.out.print("masukan angka (bilangan negatif untuk keluar) = ");
			a = input.nextInt();
		}while(a > -1);
		System.out.println("program selesai karena anda memasukan nilai negatif.");
	}
}
