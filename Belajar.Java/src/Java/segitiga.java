package Java;
//import java.util.*;

public class segitiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		 a = 5;
		 b = a/2;
		
		 for(int d = 1; d <= a; d++) {
			 if (d % 2 == 1) {
				 while(d <= b) {
					 for(int e = 1; e <= d; e++) {
						 System.out.print("*");
					 }
					 System.out.print(" ");
					 b--;
				 }
			 }
			 
			 System.out.printf("\n");
		 }
		
	}

}
