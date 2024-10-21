package Java; 
public class Bitwise {
	public static void main(String[] args) {
		
		int a = 255 ;
		String bit_a;
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		
		System.out.println(bit_a);
	}

}
