package Java;
import java.util.Arrays;

public class pengenalan_string {

	public static void main(String[] args) {
		String kata = "mamank";
		char [] katachar = {'m', 'a', 'm', 'a', 'n', 'k'};

		//PRINT STRING	
		System.out.println(kata);
		System.out.println(Arrays.toString(katachar));
		
		//mengakses komponen dari string
		System.out.println(katachar[3]);
		System.out.println(kata.charAt(3));
		printaddres("kata1", kata); 		
		
		//mengganti komponen string secara tidak langsung
		kata = kata.substring(0, 5) + "g";
		System.out.println(kata);
		
		printaddres("kata1", kata);//kedua addrenya berbeda
	}
	
	private static void printaddres(String nama, String data) {
		int address = System.identityHashCode(data);
		System.out.println(nama + " = " + data +"\t|| address = " + Integer.hashCode(address) );
	}

}
