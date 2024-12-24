package Java;
import java.util.Scanner;

public class method_exception {
	public static void main(String[] args) {
		
		
		int [] array = {1, 3, 4, 5};
		
		Scanner input = new Scanner(System.in);
		System.out.print("data ke- : ");
		int indeks = input.nextInt();
		
		//exceptision biasa
		try {
			System.out.printf("data ke- %d dalah %d.", indeks, array[indeks]);
		}catch(Exception e){
			System.err.println("out off bounds");
		}finally {
			System.out.println("selesai");
		}
		
		System.out.println("===============================");
		int data = ambildata(array, indeks);
		System.out.printf("data ke- %d dalah %d.", indeks, data);
		
		
			////exeception methhod by throws
		System.out.println("===============================");
		int data2 = 0;
		try {
			data2 = ambildata2(array, indeks);			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.printf("data ke- %d dalah %d.\n", indeks, data2);
		
		
		
		
		System.out.printf("\n\nini akhir program");
	}

	private static int ambildata2(int[] array, int indeks)throws Exception {
		int hasil = array[indeks];
		return hasil;
	
	}
	
	
	private static int ambildata(int [] array, int indeks) {
		int hasil = 0;
		try {
			hasil = array[indeks];
		}catch(Exception e){
			System.err.println("out off bounds");
		}
		
		return hasil;
		
	}
}
