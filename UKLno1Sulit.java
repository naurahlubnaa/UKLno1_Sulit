import java.util.Scanner;

public class UKLno1Sulit {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    System.out.println("=== PROGRAM REKAP NILAI UJIAN PRODUKTIF RPL ===");
    System.out.print("Masukkan jumlah siswa: ");
    int jumlahSiswa = input.nextInt();

    double totalNilai = 0;

    //Memasukkan nilai untuk setiap siswa
    for (int i = 1; i <= jumlahSiswa; i++ ) {
        System.out.println("Masukkan nilai siswa ke-" + i + ":");
        double nilai = input.nextDouble();
        totalNilai += nilai;
    }

    //Menghitung rata-rata
    double ratarata = totalNilai / jumlahSiswa;

    System.out.println("=== HASIL REKAP NILAI ===");
    System.out.println("Jumlah siswa : " +jumlahSiswa);
    System.out.println("Total nilai : " +totalNilai);
    System.out.println("Rata- rata : " +ratarata);

    input.close();
    
    }
}
