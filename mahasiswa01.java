public class mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa01(){
    }
    mahasiswa01(String nim,String nama,String kelas, double ipk){
        this. nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
        
    }
    void tampilkaninformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: "+ ipk);
    }
}
