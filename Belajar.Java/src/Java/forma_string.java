package Java;

public class forma_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nama = "udin";
		int umur = 15;
		
		//cara 1
		System.out.println("nama saya adalah " + nama +  " umur saya " + umur + "tahun.");
		
		//cara 2 : dengan format
		System.out.printf("nama saya adalah %s umur saya %d tahun", nama, umur);
		
		 //struktur format
		
		//argument indeks
		System.out.println("====== argumen indeks [$] =====");
		
		//udin, udin, kemana udin?
		System.out.printf("%1$s, %1$s, kemana %1$s?", nama);
		
		//berapa umur mu udin ? udin berumur 17, ternyata masih 17
		System.out.printf("\nBerapa umurmu %1$s? %1$s berumur %2$d, ternyata masih %2$s/n", nama, umur);
		
		//flags
		System.out.println("=========== flags ===============");
		int int1 = 5;
		int int2 = -8;
		int hsl = int1 - int2;
		System.out.printf("%d - %d = %+d", int1, int2, hsl);
		
		//width
		System.out.println("=========== width ===============");
		int int3 = 20000;
		System.out.println("integer");
		System.out.printf("%d\n", int3);
		System.out.printf("%10d\n", int3);//untuk rata kanan
		System.out.printf("%-10d\n", int3);//untuk rata kiri 
		System.out.printf("%010d\n", int3);//mengganti (" ") dengan 0 
		System.out.printf("%,d\n", int3);//menambahkab koma seriap 1000
		
		//foalting point
		System.out.println("=========== width ===============");
		float float1 = 1.433f;
		System.out.printf("%+6f", float1);
		
	}

}
