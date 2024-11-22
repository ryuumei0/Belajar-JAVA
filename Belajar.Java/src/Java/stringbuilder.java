package Java;
import java.lang.StringBuilder;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder("hallo");
		System.out.println("data = " + builder);
		System.out.println("panjang = " + builder.length());
		System.out.println("kapasitas = "+ builder.capacity());
		
		int addres = System.identityHashCode(builder);
		
		System.out.println("addrea = " + Integer.toHexString(addres));
		
		//operasi string builder
		//append
	}

}
