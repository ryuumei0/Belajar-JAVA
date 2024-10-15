package Java;

public class Logika {
	public static void main(String[] args) {
		boolean a, b, c;
		
		//operasi or(||)
		a = true;
		b = false;
		c = a || b;
		
		System.out.println("============== or =============");
		System.out.println(a + " || "+ b + " ----> "+ c);
		a = true;
		b = true;
		c = a || b;
		System.out.println(a + " || "+ b + " ----> "+ c);
		a = false;
		b = false;
		c = a || b;
		System.out.println(a + " || "+ b + " ----> "+ c);
		System.out.println();
		
		//operasi and (&&)
		a = true;
		b = false;
		c = a && b; 
		System.out.println("============== and =============");
		System.out.println(a + " && "+ b + " ----> "+ c);
		a = true;
		b = true;
		c = a && b;
		System.out.println(a + " && "+ b + " ----> "+ c);
		a = false;
		b = false;
		c = a && b;
		System.out.println(a + " && "+ b + " ----> "+ c);
		System.out.println();
		
		System.out.println("============== xor =============");
		a = true;
		b = false;
		c = a ^ b; 
		System.out.println(a + " ^ "+ b + " ----> "+ c);
		a = true;
		b = true;
		c = a ^ b;
		System.out.println(a + " ^ "+ b + " ----> "+ c);
		a = false;
		b = false;
		c = a ^ b;
		System.out.println(a + " ^ "+ b + " ----> "+ c);		
		
		System.out.println();
		
		System.out.println("============== Not =============");
		a = true;
		b = false;
		c = !a; 
		System.out.println("nilai awal = " + a + " ----> "+ c);
		c = !b;
		System.out.println("nilai awal = " + b + " ----> "+ c);

				
	}

}
 