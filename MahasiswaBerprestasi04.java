public class MahasiswaBerprestasi04 {
    Mahasiswa04[] listMhs;
    int index;

    MahasiswaBerprestasi04(int jml){
        listMhs = new Mahasiswa04[jml];
    }

    void tambah(Mahasiswa04 mhs){
        if(index < listMhs.length){
            listMhs[index] = mhs;
            index++;
        }else{
            System.out.println("List Mahasiswa sudah penuh");
        }
    }

    void tampil(){
        for(int i = 0; i < listMhs.length; i++){
            listMhs[i].tampilInformasi();
            System.out.println("__________________________");
        }
    }

    int sequentialSearch(double cari){
        int posisi = -1;
        for(int i = 0; i < listMhs.length; i++){
            if(listMhs[i].ipk == cari){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listMhs[mid].ipk){
                return (mid);
            }else if(listMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid - 1);
            }else{
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double ip, int idx){
        if(idx == -1){
            System.out.println("data " + ip + "Tidak ditemukan");
        }else{
            System.out.println("Data Mahasiswa dengan IPK : " + ip + " ditemukan pada Index :" + idx);
        }
    }

    void tampilDataSearch(double ip, int idx){
        if(idx == -1){
            System.out.println("Data Mahasiswa dengan IPK : " + ip + " ditemukan pada Index :" + idx);
        }else{
            listMhs[idx].tampilInformasi();
        }
    }
}
