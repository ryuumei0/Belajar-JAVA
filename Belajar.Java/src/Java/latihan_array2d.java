package Java;
import java.util.Arrays;

public class latihan_array2d {

	public static void main(String[] args) {
		
		int [] [] matriks_A = {
				{1, 2, 4, 7},
				{6, 3, 6, 3},
				{3, 6, 2, 5}
		};
		
		int [] [] matriks_B = {
				{5, 3, 7, 2},
				{6, 5, 2, 8},
				{6, 3, 9, 3}
		};
		
		jumlah(matriks_A, matriks_B);
	}
		
		private static void jumlah(int[][] matriks1, int[][] matriks2) {
			int [] [] hasil = new int [matriks1.length] [matriks1[0].length];
			
			for(int a = 0; a < matriks1.length; a++ ) {
				for(int  b = 0; b < matriks1[a].length; b++) {
					hasil [a][b] = matriks1[a][b] + matriks2[a][b];
				}
			}
			
			for(int a = 0; a < matriks1.length; a++ ) {
				System.out.print("{");
				for(int  b = 0; b < matriks1[a].length; b++) {
					System.out.print(hasil[a][b] +", ");
				}
				System.out.print("}");
				System.out.println();
			}
			
		}
	}

