package Java;

public class kalimatriks {
    public static void main(String[] args) {
        // Matriks pertama (2x3)
        int[][] array = {
            {2, 4, 5},
            {3, 5, 6},
            {5, 7, 6}
        
        };
        
        // Matriks kedua (3x2)
        int[][] ikan = {
            {2, 3, 5},
            {4, 5, 6},
            {1, 3, 7}
        };
        
        // Matriks hasil perkalian (2x2)
        int[][] hasil = new int[2][2];
        
        // Melakukan perkalian matriks
        for (int i = 0; i < 2; i++) { // Mengulangi baris matriks pertama
            for (int j = 0; j < 2; j++) { // Mengulangi kolom matriks kedua
                for (int k = 0; k < 3; k++) { // Mengulangi elemen dalam baris pertama dan kolom kedua
                    hasil[i][j] += array[i][k] * ikan[k][j]; // Rumus perkalian matriks
                }
            }
        }
        
        // Menampilkan hasil perkalian
        System.out.println("Matriks Hasil Perkalian:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
