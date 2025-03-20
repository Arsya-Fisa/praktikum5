import java.util.Scanner;
public class MahasiswaBerprestasi01 {
    mahasiswa01 [] listMhs;
    int  idx;
    MahasiswaBerprestasi01(int jumlahMahasiswa) {
        listMhs = new mahasiswa01[jumlahMahasiswa];
        idx = 0;
    }
    void tambah (mahasiswa01 m){
        if (idx < listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (mahasiswa01 m : listMhs){
            if (m != null) {
                m.tampilkaninformasi();
                System.out.println("----------------------");
            }
        }
    }
    void bubbleSort(){
        for (int i = 0;i <listMhs.length;i++){
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    mahasiswa01 tmp =listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        int jumlahmhs= input.nextInt();
        input.nextLine();

       MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(jumlahmhs);
       for (int i = 0; i < jumlahmhs; i++) {
        System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(input.nextLine());

            mahasiswa01 m = new mahasiswa01(nim, nama, kelas, ipk);
            list.tambah(m);
       }
       System.out.println("Data mahasiswa sebelum sorting: ");
       list.tampil();
       System.out.println("Data mahasiswa setelah sorting berdasarkan ipk (DESC) : ");
       list.bubbleSort();
       list.tampil();
    }
}
   
