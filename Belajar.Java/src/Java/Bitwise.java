package Java; 
public class Bitwise {
	public static void main(String[] args) {
		
		int a,b,c;
		String bit_a, bit_b, bit_c;
		
		a = 12;
		b = 20;
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		bit_b = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
		
		System.out.printf("%s = %d \n", bit_a, a);
		System.out.printf("%s = %d \n", bit_b, b);
		
//		operasi shift left
		System.out.println("======= SHIFT LEFT ======");
		
		a = 12;
		b = (byte)(a << 3);
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		bit_b = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
		
		System.out.printf("%s = %d \n", bit_a, a);
		System.out.println("setelah << 3 maka,");
		System.out.printf("%s = %d \n", bit_b, b);
		
//		operasi shift right
		System.out.println("======= SHIFT shift right ======");
		a = 12;
		b = (byte) (a >> 1);
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		bit_b = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
		
		System.out.printf("%s = %d \n", bit_a, a);
		System.out.println("setelah >> 1 maka,");
		System.out.printf("%s = %d \n", bit_b, b);
		
//		operasi or
		System.out.println("======= or (|) ======");
		a = 12;
		b = 20;
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		bit_b = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
		
		System.out.printf("%s = %d \n", bit_a, a);
		System.out.printf("%s = %d \n", bit_b, b);
		
		c = (byte) (a | b);
		bit_c = String.format("%8s",Integer.toBinaryString(c)).replace(" ", "0");
		
		System.out.println("hasil dari a or b maka,");
		System.out.printf("%s = %d \n",bit_c, c);
		
//		operasi and
		System.out.println("======= oand (&) ======");
		a = 12;
		b = 20;
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		bit_b = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
		
		System.out.printf("%s = %d \n", bit_a, a);
		System.out.printf("%s = %d \n", bit_b, b);
		
		c = (byte) (a & b);
		bit_c = String.format("%8s",Integer.toBinaryString(c)).replace(" ", "0");
		
		System.out.println("hasil dari a and b maka,");
		System.out.printf("%s = %d \n",bit_c, c);
	
// 		operasi or (^)
		System.out.println("======= xor (^) ======");
		a = 12;
		b = 20;
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		bit_b = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
		
		System.out.printf("%s = %d \n", bit_a, a);
		System.out.printf("%s = %d \n", bit_b, b);
		
		c = (byte) (a ^ b);
		bit_c = String.format("%8s",Integer.toBinaryString(c)).replace(" ", "0");
		
		System.out.println("hasil dari a xor b maka,");
		System.out.printf("%s = %d \n",bit_c, c);
		
//  	operasi not (~)		
		System.out.println("======= not (~) ======");
		a = 12;
		b = (byte) (~a);
		
		bit_a = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
		bit_b = String.format("%8s",Integer.toBinaryString(b)).substring(24);
		
		System.out.printf("%s = %d \n", bit_a, a);
		System.out.printf("%s = %d \n", bit_b, b);
		
	}

}
