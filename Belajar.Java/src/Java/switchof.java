package Java;
import java.util.*;

public class switchof {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, hasil;
		int pilihan;
		
		System.out.print("=========== kalkulator =======\n1. tambah (+).\n2. kurang (-)\n3. kali (*).\n4. bagi(/).\n5. sisa pembagian(%). \nmasukan pilihan (1 - 5) =  ");
		pilihan = input.nextInt();
		
		//.equals digunakan untuk string
		if (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4 || pilihan == 5) {
			System.out.print("masukan angka ke 1 = ");
			a = input.nextInt();
			
			System.out.print("masukan angka ke 2 = ");
			b = input.nextInt();
			
			switch(pilihan) {
				case 1 :
					hasil = a + b;
					System.out.printf("hasil dari %d + %d = %d",a , b, hasil);
					break;
				case 2 :
					hasil = a - b;
					System.out.printf("hasil dari %d + %d = %d",a , b, hasil);
					break;
				case 3 :
					hasil = a * b;
					System.out.printf("hasil dari %d + %d = %d",a , b, hasil);
					break;
				case 4 :
					hasil = a / b;
					if (b == 0) {
						System.out.printf("hasil dari %d + %d = tak hingga",a , b);
						break;
					}else {
						System.out.printf("hasil dari %d + %d = %d",a , b, hasil);
						break;
					}
				case 5 :
					hasil = a % b;
					System.out.printf("hasil dari %d + %d = %d",a , b, hasil);
					break;
				default :
					System.out.println("masukan pilihan yang benar");
					break;
			
			}
		}else {
			System.out.println("Masukan pilihan yang sesuai.");
		}
		
	}
}
