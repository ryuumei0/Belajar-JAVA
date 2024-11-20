package Java;

public class kalimatriks {
    public static void main(String[] args) {

        int[][] array = {
            {2, 4},
            {3, 5}
        };


        int[][] ikan = {
            {2, 3},
            {4, 5}
        };


        int baris_a = array.length;
        int kolom_a = array[0].length;
        int baris_b = ikan.length;
        int kolom_b = ikan[0].length;


        int [][] hasilkali = new int[baris_a][kolom_b];


        for (int a = 0; a < baris_a; a++) {
            for (int b = 0; b < kolom_b; b++) {
                hasilkali[a][b] = 0;
                for (int k = 0; k < kolom_a; k++) {
                    hasilkali[a][b] += array[a][k] * ikan[k][b];
                }
            }
        }

        printarray(hasilkali);
    }


    private static void printarray(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("{");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("}");
        }
    }
}
