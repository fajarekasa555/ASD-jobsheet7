import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc2.nextInt();
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("----------------------------------");
            
            list.tambah(new Mahasiswa04(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("===================================");
        System.out.println("Pencarian data");
        System.out.println("===================================");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        sc.nextLine();

        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentialSearch(cari);
        int pss = (int) posisi;
        list.tampilDataSearch(cari, pss);

        System.out.println("\nMenggunakan binary searching");
        int posisiBinary = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pssBinary = (int) posisiBinary;
        list.tampilDataSearch(cari, pssBinary);
    }
}
