package Java;
import java.lang.StringBuilder;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder("hallo");
		printdata(builder);
		
		//operasi string builder
		//append
		builder.append(" teman");
		printdata(builder);
		
		builder.append(" teman");
		printdata(builder);
		
//		//insert
		builder.insert(11, " -");
		printdata(builder);
		
		
		//dellet
		builder.delete(11, 13);
		printdata(builder);
		
		//mrubah char pada index
		builder.setCharAt(0, 'y');
		printdata(builder);
		
		//replace
		builder.replace(12, 17, "yono");
		printdata(builder);
		
		//reverse
		builder.reverse();
		printdata(builder);
		
		//casting menjadi string
		String kalimat = builder.toString();
		int addres = System.identityHashCode(kalimat);
		System.out.println(Integer.toHexString(addres));
		
	}
	
	private static void printdata(StringBuilder data) {
		
		System.out.println("============================");
		System.out.println("data = " +data);
		System.out.println("panjang = " + data.length());
		System.out.println("kapasitas = "+ data.capacity());
		
		int addres = System.identityHashCode(data);
		System.out.println("addres = " + Integer.toHexString(addres));
		
	}
}  
