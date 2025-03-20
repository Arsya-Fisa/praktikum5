import java.util.Scanner;

public class mahaiswademo01 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        input.nextLine(); 

        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(jumlahMhs);
        for (int i = 0; i < jumlahMhs; i++) {
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

        
        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan BUBBLE SORT (DESC):");
        list.bubbleSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionsort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionsort();
        list.tampil();
}
}
