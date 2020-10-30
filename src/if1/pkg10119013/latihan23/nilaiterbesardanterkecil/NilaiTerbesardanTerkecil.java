/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan23.nilaiterbesardanterkecil;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;
import java.util.Arrays;

public class NilaiTerbesardanTerkecil {
    
    static Scanner scan = new Scanner (System.in);
    
    int nilai[];
    int banyakMahasiswa;
    String nama;
    
    public void namaPetugas(){
        System.out.print("Masukkan nama petugas\t: ");
        nama = scan.next();
    }
    
    public void inputBanyakMahasiswa(){
        System.out.print("Masukkan banyak mahasiswa\t: ");
        banyakMahasiswa = scan.nextInt();
    }
    
    public void inputNilaiMahasiswa(){
        nilai = new int[banyakMahasiswa];
        for(int i=0;i<banyakMahasiswa;i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + "\t\t: ");
            nilai[i] = scan.nextInt();
        }
    }    
    
    public void tampilNilaiMahasiswa(){
        int j = 0;
        for(int n : nilai){
            System.out.println("Data Nilai Mahasiswa ke-" + (j+1) + " = " + n);
            j++;
        }
    }
    
    public int nilaiTerkecil(){
        int nilaiTerkecil = nilai[0];
        for(int n : nilai){
            if(nilaiTerkecil > n){
                nilaiTerkecil = n;
            }
        }
        return nilaiTerkecil;
    }
    
    public int nilaiTerbesar(){
        int nilaiTerbesar = nilai[0];
        for (int n : nilai){
            if(nilaiTerbesar < n){
                nilaiTerbesar = n;
            }
        }
        return nilaiTerbesar;
    }
    
    public void tampilPetugas(){
        System.out.println("Petugas\t\t: " + nama);
    }
    
    public static void main(String[] args) {
        
        NilaiTerbesardanTerkecil nilai = new NilaiTerbesardanTerkecil();
        
        System.out.println();
        System.out.println("=====PROGRAM NILAI TERBESAR DAN TERKECIL MAHASISWA=====");
        System.out.println();
        nilai.namaPetugas();
        System.out.println("---------------------------------------");
        
        nilai.inputBanyakMahasiswa();
        
        nilai.inputNilaiMahasiswa();
        
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        nilai.tampilNilaiMahasiswa();
        System.out.println();
        
        int nilaiTerkecil = nilai.nilaiTerkecil();
        System.out.println("Nilai terkecil adalah " + nilaiTerkecil);
        int nilaiTerbesar = nilai.nilaiTerbesar();
        System.out.println("Nilai terbesar adalah " + nilaiTerbesar);
        System.out.println();
        
        System.out.println("------------------------");
        nilai.tampilPetugas();
    }
    
}
