public class Mahasiswa04 {

    String nim, nama, kelas;
    double ipk;

    Mahasiswa04(){

    }

    Mahasiswa04(String nm, String nam, String kls, double ip){
        nim = nm;
        nama = nam;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("IPK\t: " + ipk);
    }
}