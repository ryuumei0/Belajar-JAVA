package Java;
import java.util.*;

public class for_loop {
	public static void main(String[] args) {
//		for(inisiasi; kondisi;Stepnilai){
//		aksi
//		}
		int sum = 0;
		int b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukan mulai angka = ");
		b = input.nextInt();
		System.out.print("masukan nilai akhir = ");
		c = input.nextInt();
		
		System.out.println("ini adalah awal program.");
		for(int a = b; a <= c; a++) {
			System.out.println("looping ke-" + a);
			sum += a;
		}
		System.out.println("jumlah semua angka adalah " + sum);
	}
}
