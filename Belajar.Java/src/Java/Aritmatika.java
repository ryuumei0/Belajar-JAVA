package Java;

public class Aritmatika {
	
	public static void main(String[] args) {
		
		int c;
		
		int a = 9;
		int b  = 3;
		
		
//		oprasi pengurangan (-)
		c = a - b;
		System.out.printf("hasil dari %d - %d = %d", a, b , c);
		System.out.println();
		
//		oprasi pertambahan (+)
		c = a + b;
		System.out.printf("hasil dari %d + %d = %d", a, b , c);		
		System.out.println();
		
//		oprasi pembagian (/)
		c = a / b;
		System.out.printf("hasil dari %d / %d = %d", a, b , c);	
		System.out.println();
		
//		oprasi perkalian (*)
		c = a * b;
		System.out.printf("hasil dari %d * %d = %d", a, b , c);	
		System.out.println();		
		
//		oprasi sisa dari pembagian (%)
		a = 5;
		b = 2;
		c = a % b;
		System.out.printf("hasil dari %d %% %d = %d", a, b , c);
		System.out.println();		
	}
}
