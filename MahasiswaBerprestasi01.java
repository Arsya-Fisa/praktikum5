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
                System.out.println("----------------------------------");
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
    void selectionsort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=1;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
        mahasiswa01 tmp =listMhs[idxMin];
        listMhs[idxMin]=listMhs[i];
        listMhs[i]=tmp;
        }
    }
    void insertionsort(){
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa01 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { 
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    
}
   
