package Java;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;

public class exception {
public static void main(String[] args) {
	int [] array = {1, 4, 5, 6};
	Scanner input = new Scanner(System.in);
	System.out.print("indek array ke: ");
	int index = input.nextInt();
	
	//exception handling (try, catch, and finally)
	System.out.println("-handling out of bounds-");
	try {
		System.out.printf("indeks ke- %d adalah %d",index, array[index]);
	}catch (Exception e){
		System.out.println(e);
	}
	
	 //io exception 
	System.out.println("-handling ioexception-");
	FileInputStream fileinput = null;
	try {
		fileinput = new FileInputStream("input.txt");
	} catch(IOException e) {
		System.err.println(e);
	}
	
	///menggabungkan 2 exception 
	System.out.println("-menggabungkan 2 exception-");
	try {
		System.out.printf("indeks ke- %d adalah %d",index, array[index]);
		fileinput = new FileInputStream("input.txt");		
	}catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("keluar dari jumlah array");
	}catch(IOException e) {
		System.err.println("file tidak ditemukan.");
	}
	
	//finally
	try {
		System.out.printf("indeks ke- %d adalah %d",index, array[index]);		
	}catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("keluar dari jumlah array");
	}finally {
		System.out.println("finaly");
	}
	
	
	System.out.println("- finnaly -");
	
	
	
	System.out.println("ini adalah akhir dari program.");
}

}
